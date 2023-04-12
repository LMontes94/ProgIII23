package Ejercicios.Clase1104.Clases;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private boolean esJefe;

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

    public void esJefe(boolean esJefe){
       this.esJefe = esJefe;
    }
    
    public boolean esJefe(){
        return esJefe;
    }
    
    public void subirAlMicro(Micro m){
     
    }
}
