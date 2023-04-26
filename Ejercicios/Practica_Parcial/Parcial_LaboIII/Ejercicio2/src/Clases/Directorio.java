package Practica_Parcial.Parcial_LaboIII.Ejercicio2.src.Clases;

import java.util.HashSet;

public class Directorio {
    private String nombre;
    private Integer tamanio;
    private HashSet<Archivo> archivos;
    private Link link;
    
    public Directorio(){
        this.nombre = "";
        this.tamanio = 0;
        this.archivos = new HashSet<Archivo>();
        this.link = new Link();
    }
    
    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public HashSet<Archivo> getArchivos() {
        return archivos;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarArchivo(Archivo a){
       this.archivos.add(a);
    }

    public void eliminarArchivo(Archivo a){
       if(this.archivos.contains(a)){
          this.archivos.remove(a);
       }else{
        System.out.println("Archivo no existe en este directorio");
       }
        // Crear runtimeException noSeEncuentraArchivo y usar un bloque try catch
    }

    public void obtenerTamanio(){
       
        for (Archivo archivo : archivos) {
            this.tamanio = this.tamanio + archivo.getTamanio();
        }
    }
}
