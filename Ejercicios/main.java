package Ejercicios;

public class main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int cont = 0;
        separador(cont);
        cont++;
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

        separador(cont);
        cont++;
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

        separador(cont);
        cont++;
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

        separador(cont);
        cont++;
        /*
         * 4. Crear una clase Cine que tenga los atributos privados película y horario:
         * ● Crear métodos públicos para la asignación y recuperación de valores.
         * ● Crear un método público obtenerCartelera() que devuelva el nombre de la
         * película y el
         * horario.
         * ● Crear una instancia y asignarle valores.
         * ● Mostrar por pantalla los valores.
         */

        Cine cine1 = new Cine();
        cine1.setPelicula("El Señor de los Anillos");
        cine1.setHorario("20:15 hs");

        System.out.println("---- Cartelera ----");
        cine1.obtenerCartelera();

        separador(cont);
        cont++;
        /*
         * Crear una clase Cine que tenga los atributos privados película y horario.
         * ● Crear métodos públicos para la asignación y recuperación de valores.
         * ● Crear una instancia y asignarle valores.
         * ● Mostrar por pantalla los valores.
         * ● Crear una segunda instancia y asignarle valores.
         * ● Mostrar por pantalla los valores.
         * ● Cambiar los valores de la primera instancia.
         * ● Mostrar en pantalla los valores de ambas instancias; concluir que la
         * instrucción new crea
         * objetos distintos.
         */

        Cine cinemax = new Cine();
        cinemax.setPelicula("Toy Story 4");
        cinemax.setHorario("15:40 hs");

        System.out.println("Pelicula: " + cinemax.getPelicula());
        System.out.println("Horario: " + cinemax.getHorario());

        Cine hoyts = new Cine();
        hoyts.setPelicula("Terminator 10");
        hoyts.setHorario("21:00 hs");

        System.out.println("Pelicula: " + hoyts.getPelicula());
        System.out.println("Horario: " + hoyts.getHorario());

        cinemax.setPelicula("Rocky 15");
        cinemax.setHorario("23:20 hs");

        System.out.println("Pelicula: " + cinemax.getPelicula());
        System.out.println("Horario: " + cinemax.getHorario());

        separador(cont);
        cont++;
        /*
         * Crear una clase Fruta con variables privadas color, peso, esEstacional.
         * ● Crear setters y getters.
         * ● Escribir una función llamada esComestible() que devuelva verdadero cuando
         * la fruta pesa menos de 200 gr y es de estación, y falso en cualquier otro
         * caso.
         * ● Definir dos constructores de modo tal que la fruta pueda crearse con los
         * valores
         * color, peso y estacional al momento de instanciarse, o bien crearse sin
         * valores
         * iniciales.
         */

        Fruta manzana = new Fruta();
        manzana.setColor("Roja");
        manzana.setPeso(50);
        manzana.setEsEstacional(true);

        Fruta sandia = new Fruta("Verde", 201, true);
        sandia.esComestible(sandia.esComestible(sandia.getPeso(), sandia.getEsEstacional()));
        System.out.println(manzana.esComestible(manzana.getPeso(), manzana.getEsEstacional()));

        separador(cont);
        cont++;

        /*
         * 7. Crear una clase Ninja con las variables privadas arteMarcial, arma, fuerza
         * (entero) y salto
         * (entero).
         * ● Crear setters y getters manualmente.
         * ● Crear una función saltar() que reciba un parámetro multiplicador (entero);
         * imprimir por consola salto x parámetro.
         * ● Crear la función ataque() que imprima por consola el arma que usa el ninja
         * y el arte marcial.
         * ● Crear dos instancias de Ninja, asignar distintos valores para cada uno de
         * los atributos e invocar las funciones saltar() y ataque().
         */
         
         Ninja naruto = new Ninja("Capoeira", "Kunai", 180, 85);
         Ninja sasuke = new Ninja("Kung Fu", "Shuriken", 175, 101);

         naruto.ataque();
         naruto.saltar(2);

         sasuke.ataque();
         sasuke.saltar(3);

    }

    private static void separador(int num) {
        System.out.println();
        System.out.println("-------Ejercicio" + num + "--------------");
        System.out.println();
    }

}
