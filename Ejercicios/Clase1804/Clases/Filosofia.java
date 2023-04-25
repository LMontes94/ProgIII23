package Clase1804.Clases;

import java.time.LocalDate;

public class Filosofia extends Libro {
   
    public Filosofia(){
       this.setCategoria("Filosofia");
    }

    @Override
    protected LocalDate sumarSemanas() {
        LocalDate fechaInicio = formatearFecha();
        return fechaInicio.plusWeeks(2); 
    }

    
}
