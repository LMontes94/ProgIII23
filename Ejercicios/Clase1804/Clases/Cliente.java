package Clase1804.Clases;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private Integer dni;
    private Integer nroCliente;
    private ArrayList<Libro> libros;

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public Integer getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(Integer nroCliente) {
        this.nroCliente = nroCliente;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void alquilarLibro(Libro l, Biblioteca b){
        Integer posLibro = b.buscarLibro(l);
        Libro libro =  b.getLibros().get(posLibro);
        if (libro.estaDisponible()) {
            this.libros.add(libro);
            b.getLibros().get(posLibro).setDisponible(false);
        }else{
            System.out.println("El libro no esta disponible!!!");
        }
    
    }

    public Libro devolverLibro(Libro l){
       int posLibro = this.libros.indexOf(l);
       Libro libro = this.libros.get(posLibro);
       this.libros.remove(posLibro);
       return libro;
    }

    public String toString(){
        return "-------------------------\n" +
               "Nro Cliente: " + nroCliente + "\n"
                + "\tNombre: " + nombre + "\n" +
                "\t DNI: " + dni + "\n" +
                "-------------------------\n";
    }
}
