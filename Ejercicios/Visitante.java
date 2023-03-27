package Ejercicios;

public class Visitante extends Persona {
    
    private int dni;
    public Visitante(String nombre, String apellido) {
        super(nombre, apellido);
        //TODO Auto-generated constructor stub
    }
    
    public int getDni(){
       return dni;
    }

    public void setDni(int dni){
        this.dni = dni;
    }
}
