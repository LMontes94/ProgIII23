package Practica_Parcial.Parcial_LaboIII.Ejercicio2.src.Clases;

public class Archivo {
    private String nombre;
    private Integer tamanio;

    public void setTamanio(Integer t){
       this.tamanio = t;
    }
    public Integer getTamanio() {
        return tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
