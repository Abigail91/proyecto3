package com.example.nano_.conductor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.nano_.conductor.*;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    Button btn16;
    Button btn17;
    Button btn18;
    Button btn19;
    Button btn20;
    Button btn21;
    Button btn22;
    Button btn23;
    Button btn24;
    Button btn25;
    Button btn26;
    Button btn27;
    Button btn28;
    Button btn29;
    Button btn30;
    TextView postext;
    TextView postext2;
    int viaje = 0;
    boolean posselec = false;
    TextView peso1;
    TextView peso2;
    TextView peso3;
    TextView peso4;
    TextView peso5;
    TextView peso6;
    TextView peso7;
    TextView peso8;
    TextView peso9;
    TextView peso10;
    TextView peso11;
    TextView peso12;
    TextView peso13;
    TextView peso14;
    TextView peso15;
    TextView peso16;
    TextView peso17;
    TextView peso18;
    TextView peso19;
    TextView peso20;
    TextView peso21;
    TextView peso22;
    TextView peso23;
    TextView peso24;
    TextView peso25;
    TextView peso26;
    TextView peso27;
    TextView peso28;
    TextView peso29;
    TextView peso30;
    TextView peso31;
    TextView peso32;
    TextView peso33;
    TextView peso34;
    TextView peso35;
    TextView peso36;
    TextView peso37;
    TextView peso38;
    TextView peso39;
    TextView peso40;
    TextView peso41;
    TextView peso42;
    TextView peso43;
    TextView peso44;
    TextView peso45;
    ArrayList<Integer> pesos= new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        confi();
    }

    private void confi() {

        btn1 = findViewById(R.id.pos);
        btn2 = findViewById(R.id.pos1);
        btn3 = findViewById(R.id.pos2);
        btn4 = findViewById(R.id.pos3);
        btn5 = findViewById(R.id.pos4);
        btn6 = findViewById(R.id.pos5);
        btn7 = findViewById(R.id.pos6);
        btn8 = findViewById(R.id.pos7);
        btn9 = findViewById(R.id.pos8);
        btn10 = findViewById(R.id.pos9);
        btn11 = findViewById(R.id.pos10);
        btn12 = findViewById(R.id.pos11);
        btn13 = findViewById(R.id.pos12);
        btn14 = findViewById(R.id.pos13);
        btn15 = findViewById(R.id.pos14);
        btn16 = findViewById(R.id.pos15);
        btn17 = findViewById(R.id.pos16);
        btn18 = findViewById(R.id.pos17);
        btn19 = findViewById(R.id.pos18);
        btn20 = findViewById(R.id.pos19);
        btn21 = findViewById(R.id.pos20);
        btn22 = findViewById(R.id.pos21);
        btn23 = findViewById(R.id.pos22);
        btn24 = findViewById(R.id.pos23);
        btn25 = findViewById(R.id.pos24);
        btn26 = findViewById(R.id.pos25);
        btn27 = findViewById(R.id.pos26);
        btn28 = findViewById(R.id.pos27);
        btn29 = findViewById(R.id.pos28);
        btn30 = findViewById(R.id.pos30);
        postext = findViewById(R.id.textpos);
        postext2 = findViewById(R.id.textView2);
        peso1 = findViewById(R.id.peso1);
        peso2 = findViewById(R.id.peso2);
        peso3 = findViewById(R.id.peso3);
        peso4 = findViewById(R.id.peso4);
        peso5 = findViewById(R.id.peso5);
        peso6 = findViewById(R.id.peso6);
        peso7 = findViewById(R.id.peso7);
        peso8 = findViewById(R.id.peso8);
        peso9 = findViewById(R.id.peso9);
        peso10 = findViewById(R.id.peso10);
        peso11 = findViewById(R.id.peso11);
        peso12 = findViewById(R.id.peso12);
        peso13 = findViewById(R.id.peso13);
        peso14 = findViewById(R.id.peso14);
        peso15 = findViewById(R.id.peso15);
        peso16 = findViewById(R.id.peso16);
        peso17 = findViewById(R.id.peso17);
        peso18 = findViewById(R.id.peso18);
        peso19 = findViewById(R.id.peso19);
        peso20 = findViewById(R.id.peso20);
        peso21 = findViewById(R.id.peso21);
        peso22 = findViewById(R.id.peso22);
        peso23 = findViewById(R.id.peso23);
        peso24 = findViewById(R.id.peso24);
        peso25 = findViewById(R.id.peso25);
        peso26 = findViewById(R.id.peso26);
        peso27 = findViewById(R.id.peso27);
        peso28 = findViewById(R.id.peso28);
        peso29 = findViewById(R.id.peso29);
        peso30 = findViewById(R.id.peso30);
        peso31 = findViewById(R.id.peso31);
        peso32 = findViewById(R.id.peso32);
        peso33 = findViewById(R.id.peso33);
        peso34 = findViewById(R.id.peso34);
        peso35 = findViewById(R.id.peso35);
        peso36 = findViewById(R.id.peso36);
        peso37 = findViewById(R.id.peso37);
        peso38 = findViewById(R.id.peso38);
        peso39 = findViewById(R.id.peso39);
        peso40 = findViewById(R.id.peso40);
        peso41 = findViewById(R.id.peso41);
        peso42 = findViewById(R.id.peso42);
        peso43 = findViewById(R.id.peso43);
        peso44 = findViewById(R.id.peso44);
        peso45 = findViewById(R.id.peso45);
    }

    public void avanzar(View view) {
        if (viaje < MainActivity.conductor1.ruta.length ) {
            postext.setText("Posicion actual: " + MainActivity.conductor1.ruta[viaje]);
            viaje = viaje + 1;
        }else if(viaje >= MainActivity.conductor1.ruta.length ){
            postext.setText("Viaje finalizado");
        }
    }
    public void onClick(View view) {

        if(posselec == false){
            posselec = true;
            switch (view.getId()){
                case R.id.pos:
                    postext.setText("Posicion actual: " +btn1.getText());
                    break;
                case R.id.pos1:
                    postext.setText("Posicion actual: " +btn2.getText());
                    break;
                case R.id.pos2:
                    postext.setText("Posicion actual: " +btn3.getText());
                    break;
                case R.id.pos3:
                    postext.setText("Posicion actual: " +btn4.getText());
                    break;
                case R.id.pos4:
                    postext.setText("Posicion actual: " +btn5.getText());
                    break;
                case R.id.pos5:
                    postext.setText("Posicion actual: " +btn6.getText());
                    break;
                case R.id.pos6:
                    postext.setText("Posicion actual: " +btn7.getText());
                    break;
                case R.id.pos7:
                    postext.setText("Posicion actual: " +btn8.getText());
                    break;
                case R.id.pos8:
                    postext.setText("Posicion actual: " +btn9.getText());
                    break;
                case R.id.pos9:
                    postext.setText("Posicion actual: " +btn10.getText());
                    break;
                case R.id.pos10:
                    postext.setText("Posicion actual: " +btn11.getText());
                    break;
                case R.id.pos11:
                    postext.setText("Posicion actual: " +btn12.getText());
                    break;
                case R.id.pos12:
                    postext.setText("Posicion actual: " +btn13.getText());
                    break;
                case R.id.pos13:
                    postext.setText("Posicion actual: " +btn14.getText());
                    break;
                case R.id.pos14:
                    postext.setText("Posicion actual: " +btn15.getText());
                    break;
                case R.id.pos15:
                    postext.setText("Posicion actual: " +btn16.getText());
                    break;
                case R.id.pos16:
                    postext.setText("Posicion actual: " +btn17.getText());
                    break;
                case R.id.pos17:
                    postext.setText("Posicion actual: " +btn18.getText());
                    break;
                case R.id.pos18:
                    postext.setText("Posicion actual: " +btn19.getText());
                    break;
                case R.id.pos19:
                    postext.setText("Posicion actual: " +btn20.getText());
                    break;
                case R.id.pos20:
                    postext.setText("Posicion actual: " +btn21.getText());
                    break;
                case R.id.pos21:
                    postext.setText("Posicion actual: " +btn22.getText());
                    break;
                case R.id.pos22:
                    postext.setText("Posicion actual: " +btn23.getText());
                    break;
                case R.id.pos23:
                    postext.setText("Posicion actual: " +btn24.getText());
                    break;
                case R.id.pos24:
                    postext.setText("Posicion actual: " +btn25.getText());
                    break;
                case R.id.pos25:
                    postext.setText("Posicion actual: " +btn26.getText());
                    break;
                case R.id.pos26:
                    postext.setText("Posicion actual: " +btn27.getText());
                    break;
                case R.id.pos27:
                    postext.setText("Posicion actual: " +btn28.getText());
                    break;
                case R.id.pos28:
                    postext.setText("Posicion actual: " +btn29.getText());
                    break;
                case R.id.pos30:
                    postext.setText("Posicion actual: " +btn30.getText());
                    break;

            }


        }
    }
    public void confipeso(){
        peso1.setText(pesos.indexOf(0));
        peso2.setText(pesos.indexOf(1));
        peso3.setText(pesos.indexOf(2));
        peso4.setText(pesos.indexOf(3));
        peso5.setText(pesos.indexOf(4));
        peso6.setText(pesos.indexOf(5));
        peso7.setText(pesos.indexOf(6));
        peso8.setText(pesos.indexOf(7));
        peso9.setText(pesos.indexOf(8));
        peso10.setText(pesos.indexOf(9));
        peso11.setText(pesos.indexOf(10));
        peso12.setText(pesos.indexOf(11));
        peso13.setText(pesos.indexOf(12));
        peso14.setText(pesos.indexOf(13));
        peso15.setText(pesos.indexOf(14));
        peso16.setText(pesos.indexOf(15));
        peso17.setText(pesos.indexOf(16));
        peso18.setText(pesos.indexOf(17));
        peso19.setText(pesos.indexOf(18));
        peso20.setText(pesos.indexOf(19));
        peso21.setText(pesos.indexOf(20));
        peso22.setText(pesos.indexOf(21));
        peso23.setText(pesos.indexOf(22));
        peso24.setText(pesos.indexOf(23));
        peso25.setText(pesos.indexOf(24));
        peso26.setText(pesos.indexOf(25));
        peso27.setText(pesos.indexOf(26));
        peso28.setText(pesos.indexOf(27));
        peso29.setText(pesos.indexOf(28));
        peso30.setText(pesos.indexOf(29));
        peso31.setText(pesos.indexOf(30));
        peso32.setText(pesos.indexOf(31));
        peso33.setText(pesos.indexOf(32));
        peso34.setText(pesos.indexOf(33));
        peso35.setText(pesos.indexOf(34));
        peso36.setText(pesos.indexOf(35));
        peso37.setText(pesos.indexOf(36));
        peso38.setText(pesos.indexOf(37));
        peso39.setText(pesos.indexOf(38));
        peso40.setText(pesos.indexOf(39));
        peso41.setText(pesos.indexOf(40));
        peso42.setText(pesos.indexOf(41));
        peso43.setText(pesos.indexOf(42));
        peso44.setText(pesos.indexOf(43));
        peso45.setText(pesos.indexOf(44));


    }
}