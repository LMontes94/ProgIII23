package Clase1804.Clases;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Cliente> clientes;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
        this.clientes = new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public Integer buscarLibro(Libro l) {
        return this.libros.indexOf(l);
    }

    public void cancelarAlquiler(Cliente c, Libro l) {
        int posCliente = this.clientes.indexOf(c);
        Cliente cliente = this.clientes.get(posCliente);
        Libro libro = cliente.devolverLibro(l);
        this.libros.get(this.buscarLibro(libro)).setDisponible(true);
    }

    public Integer buscarClienteQueAlquiloLibro(Libro l){
        for (int i = 0; i < this.clientes.size(); i++) {
            int posLibro = this.clientes.get(i).getLibros().indexOf(l);
           if(posLibro >= 0){
              return i;
           } 
        }  
        return -1;
    }

    public void verClienteQueAlquiloLibro(Integer posCliente, Libro l){
       Cliente c = this.clientes.get(posCliente);
       System.out.println("El cliente: " + c);
       System.out.println("Tiene el libro " + l.getCodLibro() + " - " + l.getNombre());
    }
    
    public Integer contarLibrosDisponibles(){
         Integer librosDisponibles = 0;
        for (int i = 0; i < this.libros.size(); i++) {
            if (this.libros.get(i).estaDisponible()) {
                librosDisponibles++;
            }
        }
        return librosDisponibles;
    }
    
    public void verCantidadLibrosDisponibles(){
       for (int i = 0; i < this.libros.size(); i++) {
          if (this.libros.get(i).estaDisponible()) {
            System.out.println(this.libros.get(i));
          }
       }
       System.out.println("Cantidad total de libros disponibles: " + this.contarLibrosDisponibles());
    }
}
