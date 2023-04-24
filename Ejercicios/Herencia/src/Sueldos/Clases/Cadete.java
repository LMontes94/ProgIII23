package Sueldos.Clases;

public class Cadete extends Empleado {

    public Cadete(String n, Integer l, Integer f) {
        super(n, l, f);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void sueldoFijo() {
        this.getSueldo().setSueldoNeto(1000.0);   
    }
    
}
