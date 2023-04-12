package Ejercicios.Clase1104.Clases;

import java.util.HashSet;

public class Micro {
    private Integer totalAsientos;
    private Integer maxParados;
    private Double volumen;
    private HashSet<Empleado> pasajeroSentados;
    private HashSet<Empleado> pasajerosParados;
    
    public Micro(Integer maxS, Integer maxP, Double v){
        this.totalAsientos = maxS;
        this.maxParados = maxP;
        this.volumen = v;
        this.pasajeroSentados = new HashSet<Empleado>();
        this.pasajerosParados = new HashSet<Empleado>();
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
    
    public void inicarAsientos() {
       
        for(int i = 0; i < this.getTotalAsientos(); i++){
           this.pasajeroSentados.add(null);
        }
    }

    public boolean hayLugar(){
        if (this.asientosLibres() > 0 && this.espacioParado() > 0) {
            return true;
        }
        return false;
    }

    public Integer asientosLibres(){
        Integer i = 0;
        while (i < pasajeroSentados.size()){
            i++;
        }
        return i;
    }

    public Integer espacioParado(){
        return 0;
    }
}
