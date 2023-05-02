package Ejercicio16.src.Clases.Vehiculo;

import java.util.ArrayList;

import Ejercicio16.src.Clases.Elemento.Elemento;

public abstract class Vehiculo {
    private String patente;
    private ArrayList<Elemento> elementos;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public abstract void cargar(Elemento e);

    public void listarItems() {
       for (Elemento e : elementos) {
           System.out.println(e);
       }
    }
}
