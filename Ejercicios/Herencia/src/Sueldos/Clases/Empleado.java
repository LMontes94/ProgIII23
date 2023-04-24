package Sueldos.Clases;

public abstract class Empleado {
    private String nombre;
    private Integer legajo;
    private Integer faltas;
    private Sueldo sueldo;

    public Empleado(String n, Integer l, Integer f){
       this.nombre = n;
       this.legajo = l;
       this.faltas = f;
       this.sueldo = new Sueldo();
    }

    public Integer getFaltas() {
        return faltas;
    }

    public void setFaltas(Integer faltas) {
        this.faltas = faltas;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public abstract void sueldoFijo();
}