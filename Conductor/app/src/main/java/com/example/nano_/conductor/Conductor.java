package com.example.nano_.conductor;

public class Conductor {
    public int carné;
    public double nota;
    public String[] ruta = {"A","B","H","M","R","S","T","Y","Z","TEC"} ;
    public int espacios;
    public int cantidad_viajes;
    public String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;}
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

    public void setRuta(String[] ruta){this.ruta = ruta;}

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

    public int getCantidad_viajes(){return  cantidad_viajes;}

    public void setCantidad_viajes(int cantidadViajes){this.cantidad_viajes = cantidadViajes;}
}

