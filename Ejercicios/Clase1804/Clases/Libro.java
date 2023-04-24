package Clase1804.Clases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    public void fechaLimite(String fecha){
        LocalDate fechaInicio = LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);
        
    }
}
