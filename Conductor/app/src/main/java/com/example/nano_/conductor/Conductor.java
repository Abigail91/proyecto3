package com.example.nano_.conductor;

import java.util.ArrayList;

public class Conductor {
    public static int carné;
    public static double nota;
    public String[] ruta = {"A","B","H","M","R","S","T","Y","Z","TEC"} ;
    public int espacios;
    //  public node pos;
    public Conductor(){

    }

    public void setCarné(int carné) {

        this.carné = carné;
    }

    public int getCarné() {
        return carné;
    }

    public String[] getRuta() {
        return ruta;
    }

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

