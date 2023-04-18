package Coleccion.Pelicula.Clases;

import java.util.Comparator;

public class CirterioFechaEstreno implements Comparator <Pelicula> {

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
      int diff = o1.getFechaEstreno().getAnio() - o2.getFechaEstreno().getAnio();
      return diff > 0 ? 1 : diff  < 0 ? -1 : 0; 
    }
    
}
