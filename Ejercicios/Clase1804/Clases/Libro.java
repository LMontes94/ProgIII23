package Clase1804.Clases;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Libro {
    private String nombre;
    private String autor;
    private Integer codLibro;
    private Integer cantCapitulo;
    private Fecha fechaPrestamo;
    private boolean isDisponible;
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean isDisponible) {
        this.isDisponible = isDisponible;
    }

    public Fecha getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Fecha fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Integer getCantCapitulo() {
        return cantCapitulo;
    }

    public void setCantCapitulo(Integer cantCapitulo) {
        this.cantCapitulo = cantCapitulo;
    }

    public Integer getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(Integer codLibro) {
        this.codLibro = codLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean estaDisponible() {
        return this.isDisponible;
    }

    public boolean equals(Object obj) {
        Libro otro = (Libro) obj;
        return this.nombre.equals(otro.nombre);
    }

    public String toString() {
        return "Titulo: " + nombre + "\n" +
                "Autor: " + autor + "\n" + 
                "Categoria: " + categoria;

    }
    
    protected LocalDate formatearFecha(){
       DateTimeFormatter formateo = DateTimeFormatter.ISO_DATE;
       return LocalDate.parse(this.fechaPrestamo.toString(), formateo);
    }

    protected LocalDate sumarSemanas(){
        LocalDate fechaInicio = formatearFecha();
        return fechaInicio.plusWeeks(5);  
    }

    public void fechaLimite(){
        LocalDate fechaDevolucion = this.sumarSemanas();        
        System.out.println( "La fecha limite es: " + fechaDevolucion);
    }

    public void diasRestantesDelPrestamo(){
        LocalDate fechaInicio = formatearFecha();
        LocalDate fechaDevolucion = this.sumarSemanas();

        Duration diff = Duration.between(fechaInicio, fechaDevolucion);
        System.out.println("Quedan " + diff + " dias para la devolucion!!");
    }
}
