package Ejercicios.Clase1104.Clases;

import java.util.ArrayList;
import java.util.HashSet;

public class Micro {
    private Integer totalAsientos;
    private Integer maxParados;
    private Double volumen;
    private Empleado primerPasajero;
    private HashSet<Empleado> pasajeroSentados;
    private HashSet<Empleado> pasajerosParados;
    
    public Micro(Integer maxS, Integer maxP, Double v){
        this.totalAsientos = maxS;
        this.maxParados = maxP;
        this.volumen = v;
        this.primerPasajero = new Empleado();
        this.pasajeroSentados = new HashSet<Empleado>();
        this.pasajerosParados = new HashSet<Empleado>();
        this.pasajeroSentados = null;
        this.pasajerosParados = null;
    }

    public Integer getTotalAsientos(){
        return totalAsientos;
    }

    public void setTotalAsientos(Integer max){
        this.totalAsientos = max;
    }

    public Integer getMaxParados(){
        return maxParados;
    }

    public void setMaxParados(Integer maxP){
        this.maxParados = maxP;
    }

    public Double getVolumen(){
        return volumen;
    }

    public void setVolumen(Double v){
        this.volumen = v;
    }
    
    public Empleado getPrimerPasajero(){
        return this.primerPasajero;
    }

    public HashSet<Empleado> getPasajerosSentados(){
         return this.pasajeroSentados;
    }

    public HashSet<Empleado> getPasajerosParados(){
        return this.pasajerosParados;
    }
    
    public boolean estaVacio(){
        return this.pasajeroSentados == null && this.pasajerosParados == null;
    }
    
    public void guardarPrimerPasajero(Empleado p){
        this.primerPasajero = p;
    }
    
    public int lugarLibre(){

    }

    public int asientosLibres(){
     
    }

    public int espaciosLibres(){
       return this.asientosLibres() + this.lugarLibre();
    }

    public boolean hayLugar(){
        return espaciosLibres() != 0;
    }




}
