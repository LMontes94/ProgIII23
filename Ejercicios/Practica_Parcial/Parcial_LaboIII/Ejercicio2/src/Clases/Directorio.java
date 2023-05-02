package Practica_Parcial.Parcial_LaboIII.Ejercicio2.src.Clases;

import java.util.ArrayList;

import Practica_Parcial.Parcial_LaboIII.Ejercicio2.src.Exception.DirectorioVacioException;

public class Directorio implements TipoDato {
    private String nombre;
    private ArrayList<TipoDato> archivos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Directorio() {
        this.archivos = new ArrayList<TipoDato>();
        this.archivos = null;
    }

    @Override
    public Integer tamanio() {
        Integer t = 0;
        if (this.archivos != null) {
            for (TipoDato tipoDato : archivos) {
                t = t + tipoDato.tamanio();
            }
            return t;
        }
        return t;
    }

    public void agregarArchivo(TipoDato d) {
        this.archivos.add(d);
    }

    public void eliminarArchivo(TipoDato d) throws DirectorioVacioException {
        if (this.archivos != null) {
            this.archivos.remove(d);
        } else {
            throw new DirectorioVacioException(".");
        }
    }

}
