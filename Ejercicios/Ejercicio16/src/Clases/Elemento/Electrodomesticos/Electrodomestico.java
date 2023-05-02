package Ejercicio16.src.Clases.Elemento.Electrodomesticos;

import Ejercicio16.src.Clases.Elemento.Elemento;

public abstract class Electrodomestico extends Elemento {
    private Integer voltaje;

    public Integer getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(Integer voltaje) {
        this.voltaje = voltaje;
    }
}
