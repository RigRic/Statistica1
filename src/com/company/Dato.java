package com.company;

public class Dato {
    private String Cognome;
    private String Nome;
    private float Altezza;
    Dato(String Cognome,String Nome,float Altezza){
        this.Cognome=Cognome;
        this.Nome=Nome;
        this.Altezza=Altezza;
    }
    public String getCognome(String Cognome){
        return Cognome;
    }
    public String getNome(String Nome){
        return Nome;
    }
    public float getAltezza(float Altezza){
        return Altezza;
    }
}
