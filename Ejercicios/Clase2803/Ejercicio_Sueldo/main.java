package Ejercicios.Clase2803.Ejercicio_Sueldo;

import Ejercicios.Clase2803.Ejercicio_Sueldo.Clases.CalculadorSueldo;
import Ejercicios.Clase2803.Ejercicio_Sueldo.Clases.Empleado;
import Ejercicios.Clase2803.Ejercicio_Sueldo.Clases.Gerente;
import Ejercicios.Clase2803.Ejercicio_Sueldo.Clases.Sueldo;


public class main {
    
    public static void main(String[] args) {
        Gerente Pepe = new Gerente();
        Pepe.setNombre("Pepe");
        Pepe.setLegajo("EM1022");
        Pepe.setSueldo();
        Pepe.setDiasAusentes(6);
        
        CalculadorSueldo Cs = new CalculadorSueldo();
        Sueldo sueldo = new Sueldo();
        Double sueldoF = Cs.calcularSueldo(Pepe,sueldo);

        System.out.println(sueldoF);
    }
}
