package Ejercicios;

public class main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        System.out.println("-------Ejercicio 1 --------------");
        /*
         * Crear una clase Persona que tenga los atributos públicos nombre y apellido.
         * ● Crear una instancia y asignarle valores.
         * ● Mostrar por pantalla los valores asignados.
         */
        Persona lucas = new Persona("Lucas", "Montes");
        Persona maria = new Persona(null, null);
        maria.nombre = "Maria";
        maria.apellido = "Perez";
        System.out.println(lucas.nombre + " " + lucas.apellido);
        System.out.println(maria.nombre + " " + maria.apellido);

        System.out.println("-------Ejercicio 2 --------------");
        /*
         * Crear una clase Vehiculo que tenga los atributos públicos marca, modelo y un
         * atributo privado
         * patente.
         * ● Crear una instancia y asignarle valores; notar que el atributo privado no
         * está disponible
         * para la asignación de valores.
         * ● Mostrar por pantalla los valores asignados.
         */
        Vehiculo auto1 = new Vehiculo();
        auto1.marca = "Ford";
        auto1.modelo = "Fiesta";
        auto1.setPatente("AS XC VD 102");

        System.out.println("Marca: " + auto1.marca);
        System.out.println("Modelo: " + auto1.modelo);
        System.out.println("Patente: " + auto1.getPatente());

        System.out.println("-------Ejercicio 3 --------------");
        /*
         * Crear una clase Articulo que tenga los atributos privados marca y modelo.
         * ● Crear métodos públicos para la asignación de valores.
         * ● Crear una instancia y asignarle valores.
         * ● Notar que no es posible mostrar los valores por pantalla y analizar el
         * motivo por lo que
         * esto ocurre.
         */
         Articulo articulo1 = new Articulo();
         articulo1.setMarca("Genius");
         articulo1.setModelo("DX-110");

         System.out.println("Marca: " + articulo1.getMarca());
         System.out.println("Modelo: " + articulo1.getModelo());
         
        System.out.println("-------Ejercicio 4 --------------");
        /*
         * 4. Crear una clase Cine que tenga los atributos privados película y horario:
         * ● Crear métodos públicos para la asignación y recuperación de valores.
         * ● Crear un método público obtenerCartelera() que devuelva el nombre de la
         * película y el
         * horario.
         * ● Crear una instancia y asignarle valores.
         * ● Mostrar por pantalla los valores.
         */

         
    }

}
