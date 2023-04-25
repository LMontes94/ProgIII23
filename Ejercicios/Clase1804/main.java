package Clase1804;

import Clase1804.Clases.Fecha;
import Clase1804.Clases.Libro;

public class main {
    
    public static void main(String[] args) {
        
        Libro libro = new Libro();
        libro.setNombre("null");
        libro.setAutor("Jose Perez");
        libro.setFechaPrestamo(new Fecha(15, 04, 2023));

        libro.diasRestantesDelPrestamo();
    }
}
