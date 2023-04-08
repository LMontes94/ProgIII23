package Ejercicios.Clase2803.Ej_Sueldo;

public class main {
    
    public static void main(String[] args) {

        //Categoria gerente = new Categoria();
        //gerente.setSueldoBruto(100000.0);

        Cadete cadete = new Cadete();
        cadete.sueldoBrutoFijo();

        Empleado Pepe = new Empleado();
        //Pepe.getCategoria().setSueldoBruto(2000.0);
        Resultado r = new Resultado();
        Presentismo p = new Presentismo();
        Sueldo s = new Sueldo();

        Pepe.setCategoria(cadete);
        Pepe.setResultado(r);
        Pepe.getResultado().setOpcion(1);
        Pepe.setPresentismo(p);
        Pepe.setSueldo(s);
         Pepe.setDiasAusentes(6);
        Pepe.getSueldo();
       

        System.out.println(Pepe.getSueldo());
    }
} 
