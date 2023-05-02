package Practica_Parcial.Parcial_LaboIII.Ejercicio2.src.Clases;

public class Archivo implements TipoDato{
    private String nombre;
    private Integer tamanio;

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Integer tamanio() {
        return this.tamanio;
    }
}
