package Ejercicios.Clase2803.Ejercicio_Sueldo.Clases;

public class CalculadorSueldo {

    public Double calcularSueldo(Empleado e,Sueldo s){
        return e.getNeto() + s.presentismo(e.getDiasAusentes()) + s.bonoXResultado(e.getNeto()); 
    }
}
