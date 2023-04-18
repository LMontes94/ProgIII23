package Coleccion.Pelicula;

import java.util.Collections;
import java.util.LinkedList;

import Coleccion.Pelicula.Clases.CirterioFechaEstreno;
import Coleccion.Pelicula.Clases.CriterioVizualizacion;
import Coleccion.Pelicula.Clases.Fecha;
import Coleccion.Pelicula.Clases.Pelicula;

public class main {
    
    public static void main(String[] args){
        
        LinkedList<Pelicula> p = new LinkedList<Pelicula>();
        
        p.add(0, new Pelicula("El Señor de los Anillos","Peliculon", new Fecha(03,06,2002),"USA",0));
        p.add(0, new Pelicula("El Señor de los Anillos: Las dos Torres","Peliculon", new Fecha(03,06,2003),"USA",0));
        p.add(0, new Pelicula("El Señor de los Anillos: El Retorno del Rey","Peliculon", new Fecha(03,06,2006),"USA",0));
        p.add(0, new Pelicula("Agente 007","Peliculon", new Fecha(13,8,1991),"USA",0));
        p.add(0, new Pelicula("Rocky","Peliculon", new Fecha(03,10,1989),"USA",0));
        
        cargaDeVisualizaciones(p);
        System.out.println("-------------------------------------------------------------");
        
        Collections.sort(p,new CriterioVizualizacion());
        mostrar(p);
        
        System.out.println("-------------------------------------------------------------");
        
        Collections.sort(p,new CirterioFechaEstreno());
        mostrar(p);
    }

    public static void mostrar(LinkedList<Pelicula> p){
        for (Pelicula pelicula : p) {
            System.out.println("-------------------------------------------------------------");
            System.out.println(pelicula);
            System.out.println("-------------------------------------------------------------");
        }
    }

    public static void cargaDeVisualizaciones(LinkedList<Pelicula> p){
        p.get(0).visualizar();
        p.get(0).visualizar();
        p.get(0).visualizar();
        p.get(0).visualizar();
        p.get(0).visualizar();
        p.get(0).visualizar();

        p.get(1).visualizar();
        p.get(1).visualizar();

        p.get(2).visualizar();
        p.get(2).visualizar();
        p.get(2).visualizar();

        p.get(3).visualizar();

        p.get(4).visualizar();
        p.get(4).visualizar();
        p.get(4).visualizar();
    }
}
