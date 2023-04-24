package Sueldos.Clases;

public class Administrativo extends Empleado {

    public Administrativo(String n, Integer l, Integer f) {
        super(n, l, f);
    }

    @Override
    public void sueldoFijo() {
      this.getSueldo().setSueldoNeto(40000.0);
    }
    
}
