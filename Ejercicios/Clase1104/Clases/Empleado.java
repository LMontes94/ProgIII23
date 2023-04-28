package Ejercicios.Clase1104.Clases;

import java.util.HashSet;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private HashSet<Empleado> empleadosACargo;

    public HashSet<Empleado> getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(HashSet<Empleado> empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String a){
        this.apellido = a;
    }

    public String getLegajo(){
        return legajo;
    }

    public void setLegajo(String l){
        this.legajo = l;
    }
    
    public void subirAlMicro(Micro m){
     
    }
}
