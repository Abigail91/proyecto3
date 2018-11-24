package com.example.nano_.conductor;

public class pasajero {
    public static int carné;
    public static double nota;
    public static boolean espera;
    public static boolean carpooling;
//  public node pos;
    public pasajero(){

    }

    public void setCarné(int carné) {
        this.carné = carné;
    }

    public int getCarné() {
        return carné;
    }

    public void setEspera(boolean espera) {
        this.espera = espera;
    }

    public boolean isEspera() {
        return espera;
    }

    public void setCarpooling(boolean carpooling) {
        this.carpooling = carpooling;
    }

    public boolean isCarpooling() {
        return carpooling;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
