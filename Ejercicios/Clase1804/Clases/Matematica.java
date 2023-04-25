package Clase1804.Clases;

import java.time.LocalDate;

public class Matematica extends Libro {
    
    public Matematica(){
        this.setCategoria("Matematica");
    }

    @Override
    protected LocalDate sumarSemanas() {
        LocalDate fechaInicio = formatearFecha();
        if (this.getCantCapitulo() > 1) {
           return fechaInicio.plusWeeks(3);  
        }
        return fechaInicio.plusWeeks(1);
    }
}
