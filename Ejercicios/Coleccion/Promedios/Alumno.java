package Coleccion.Promedios;

import java.util.ArrayList;
import java.util.Hashtable;

public class Alumno {

    private String nombreApellido;
    private Integer edad;
    private Carrera carrera;
    private Hashtable<Materia, ArrayList<Integer>> notas;

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
    
    public void cargarNota(ArrayList<Integer> n, Materia k){
       
        this.notas.get(k);
        this.notas.put(k,(n) );
    }

    public void mostrarNotas(){

    }

}
