package com.example.nano_.conductor;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.Profile;
import com.facebook.login.LoginManager;
import com.google.zxing.Result;
import com.example.nano_.conductor.*;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView texto;
    public Button btnscan;
    public ZXingScannerView camara;
    public int carné;
    public static Conductor conductor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        conductor1 = new Conductor();
        btnscan = (Button) findViewById(R.id.buttoncode);
        btnscan.setOnClickListener(this);
        if(AccessToken.getCurrentAccessToken()==null){
            goToLoginScreen();
        }else{
            Profile profile=Profile.getCurrentProfile();
            if (profile != null) {
                displayProfileInfo(profile);
            } else {
                Profile.fetchProfileForCurrentAccessToken();
            }
        }
    }

    private void displayProfileInfo(Profile profile) {
        String id = profile.getId();
        String name = profile.getName();
        conductor1.setId(profile.getId());
        texto = (TextView) findViewById(R.id.nameTextView);
        texto.setText("id de Facebook: "+ id);
        texto = (TextView) findViewById(R.id.textView5);
        texto.setText("Nombre: "+ name);
    }

    @Override
    public void onClick(View view) {
        camara = new ZXingScannerView (this);
        camara.setResultHandler(new ScannerActivity());
        setContentView(camara);
        camara.startCamera();
    }

    private void goToLoginScreen() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }



    public void logout(View view) {
        LoginManager.getInstance().logOut();
        goToLoginScreen();
    }
    public void showinfo(View view) {
        texto = (TextView) findViewById(R.id.textView2);
        texto.setText("Calificación: " + conductor1.getNota());
        texto = (TextView) findViewById(R.id.textView);
        texto.setText("Carné: " + conductor1.getCarné());
    }

    public void goMapScreen(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
    public class ScannerActivity implements ZXingScannerView.ResultHandler{

        @Override
        public void handleResult(Result result) {
            String dato = result.getText();

            setContentView(R.layout.activity_main);
            conductor1.setCarné(Integer.parseInt(dato));
            camara.stopCamera();
        }
    }

}
