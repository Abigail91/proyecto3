package com.example.nano_.facebooktest;

public class pasajero {
    public static int carné;
    public double nota;
    public boolean espera;
    public boolean carpooling;
    public int cant_viajes;
    public String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;}
//  public node pos;
    public  pasajero(){

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
    public void setCant_viajes(int cant_viajes){this.cant_viajes = cant_viajes;}
    public int getCant_viajes(){return cant_viajes;}
}
