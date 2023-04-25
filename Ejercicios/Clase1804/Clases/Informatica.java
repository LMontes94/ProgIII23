package Clase1804.Clases;

import java.time.LocalDate;

public class Informatica extends Libro {
    

    public Informatica(){
        this.setCategoria("Informatica");
    }
    @Override
    protected LocalDate sumarSemanas() {
        LocalDate fechaInicio = formatearFecha();
        return fechaInicio.plusWeeks(2); 
    }
}
