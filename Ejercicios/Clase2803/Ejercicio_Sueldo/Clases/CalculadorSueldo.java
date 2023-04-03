package Ejercicios.Clase2803.Ejercicio_Sueldo.Clases;

public class CalculadorSueldo {
    private Sueldo s;

    public Double calcularSueldo(Empleado e){
        return e.getNeto() + s.presentismo(e.getDiasAusentes()) + s.bonoXResultado(e.getNeto()); 
    }
}
