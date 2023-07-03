package Clases;

import java.util.ArrayList;

public class Combo {
    private String nombre;
    private double descuento;
    private ArrayList<Mueble> muebles; // Corrección: parametrizar con el tipo Mueble

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public ArrayList<Mueble> getMuebles() {
        return muebles;
    }

    public void setMuebles(ArrayList<Mueble> muebles) {
        this.muebles = muebles;
    }

    public Combo(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.muebles = new ArrayList<>();
    }

    public void agregarMueble(Mueble mueble) {
        muebles.add(mueble);
    }

    public double calcularPrecio() {
        double totalPrecio = 0;
        for (Mueble mueble : muebles) {
            totalPrecio += mueble.calcularPrecio();
        }
        totalPrecio -= totalPrecio * (descuento / 100);
        return totalPrecio;
    }
}
