package Ejercicios;

public class Guardia extends Persona{

    public Guardia(String nombre, String apellido) {
        super(nombre, apellido);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void presentarse(){
        System.out.println("Hola, mi nombre es "+this.getNombre() + " "+ this.getApellido() +" y soy el guardia.");
    }

    public void controlarDocumento(String nombre, String apellido,int dni){
        System.out.println("Adelante "+ nombre +" "+ apellido +  " con dni " + dni);
    }
}
