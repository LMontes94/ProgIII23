package Coleccion.Pelicula.Clases;

import java.util.Comparator;

public class CriterioVizualizacion implements Comparator <Pelicula>{

    @Override
    public int compare(Pelicula o1, Pelicula o2) {
        int  diff = -o1.getVisualizaciones() + o2.getVisualizaciones();
        return diff < 0 ? -1 : diff > 0 ? 1 : 0; 
    }
    
}
