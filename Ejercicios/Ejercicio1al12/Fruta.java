package Ejercicios.Ejercicio1al12;

public class Fruta {
    private String color;
    private float peso;
    private boolean esEstacional;

    public Fruta() {

    }

    public Fruta(String color, float peso, boolean esEstacional) {
        this.color = color;
        this.peso = peso;
        this.esEstacional = esEstacional;
    }

    public String getColor() {
        return color;
    }

    public float getPeso() {
        return peso;
    }

    public boolean getEsEstacional() {
        return esEstacional;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEsEstacional(boolean esEstacional) {
        this.esEstacional = esEstacional;
    }

    public boolean esComestible(float peso, boolean esEstacional) {

        if (peso > 200 || esEstacional != true) {
            return false;
        }
        return true;
    }

    public void esComestible(boolean comestible) {

        if (comestible) {
            System.out.println("Es comestible");
        } else {
            System.out.println("No es comestible");
        }
    }
}
