package Coleccion.Promedios;

import java.util.ArrayList;
import java.util.Hashtable;

public class Alumno {

    private String nombreApellido;
    private Integer edad;
    private Carrera carrera;
    private Hashtable<Materia, Nota> notas;

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    
    public Carrera getCarrera(){
        return carrera;
    }

    public void inscribirCarrera(Carrera c, Carrera cod){
        try {
            c.equals(cod);
            this.carrera = c; 
        } catch (Exception e) {
            System.out.println("Codigo de carrera invalido!!!");
        }           
    }

    public void inscribirMateria(Materia m, Carrera c){
       try {
         if(c.getMaterias().contains(m)){
           this.notas.put(m, null);
         }
          
       } catch (Exception e) {
         System.out.println("No existe esta materia para esta carrera!!!");
       }
    }
    
    public void cargarNota(Integer n, Materia k){
       /* *
        Nota nota = new Nota();
        nota.add(n);
        Hashtable <Integer, ArrayList<Integer>> tabla = new Hashtable<Integer,ArrayList<Integer>>();
        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(12);
        notas.add(15);
        notas.add(16);
        tabla.put(1, notas);
        notas.add(13);
        notas.add(16);
        notas.add(20);
        tabla.put(2, notas);
        notas.add(15);
        notas.add(25);
        notas.add(35);
        tabla.put(3, notas);

        for (Enumeration<Integer> e = tabla.keys(); e.hasMoreElements(); ) {
            int key = e.nextElement();
            ArrayList<Integer>  valu = tabla.get(key);
            valu.add(21);
            System.out.println("Valor: "+ valu);
        }
    }*/
    }

    public void mostrarNotas(){

    }

}
