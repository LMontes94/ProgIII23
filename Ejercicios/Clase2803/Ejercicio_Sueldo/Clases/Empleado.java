package Ejercicios.Clase2803.Ejercicio_Sueldo.Clases;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private Integer diasAusentes;
    private Double neto;
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
       this.apellido = apellido;
    }

    public String getLegajo(){
        return legajo;
    }

    public void setLegajo(String legajo){
        this.legajo = legajo;
    }

    public Integer getDiasAusentes(){
        return diasAusentes;
    }

    public void setDiasAusentes(Integer diasAusentes){
        this.diasAusentes = diasAusentes;
    }

    public Double getNeto(){
        return neto;
    }

    public void setNeto(Double neto){
        this.neto = neto;
    }
}