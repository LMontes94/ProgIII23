package Coleccion.Promedios;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Alumno {

    private String nombreApellido;
    private Integer edad;
    private Carrera carrera;
    private Hashtable<Materia, Nota> notas;
    
    public Alumno(){
        this.notas = new Hashtable<Materia, Nota>();
    }

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

    public void inscribirCarrera(Carrera cod, Carrera c){
        try {
            if(c.equals(cod)){
               this.carrera = cod; 
            }            
             
        } catch (Exception e) {
            System.out.println("Codigo de carrera invalido!!!");
        }           
    }

    public void inscribirMateria(Materia m, Carrera c){
         try {
            if(c.getMaterias().contains(m)){
            Nota nota = new Nota();
            this.notas.put(m,nota);
        }
         } catch (Exception e) {
            System.out.println("Esta carrera no se dicta en esta institucion!!");
         }
        
         
    }
    
    public void cargarNota(Integer n, Materia k){
        
        Nota notas = new Nota();
        if (this.notas.get(k) == null) {          
           notas.add(n);
        }else{
           notas = this.notas.get(k); 
           notas.add(n);
        }    
       this.notas.put(k, notas);
      
    }

    public void mostrarNotas(Materia m){
        Nota notas = this.notas.get(m);
        notas.mostrarNotas();
    }
    
    public String toString(){
        return "Alumno : " + nombreApellido + "\n"+
                "\tEdad: " + edad + "\n" +
                "\tCarrera " + this.carrera.getNombre() + "\n";
    } 
    public void mostrarNotasXMaterias(){

       for(Enumeration<Materia> e = this.notas.keys(); e.hasMoreElements();){
           Materia key = e.nextElement();
           Nota nota = this.notas.get(key);

           System.out.println("Materia: " + key.getNombre());
           nota.mostrarNotas();

       }
    }

}
