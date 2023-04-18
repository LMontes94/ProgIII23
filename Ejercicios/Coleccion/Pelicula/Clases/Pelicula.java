package Coleccion.Pelicula.Clases;

public class Pelicula {
    
    private String titulo;
    private String descripcion;
    private Fecha fechaEstreno;
    private String paisOrigen;
    private Integer visualizaciones;
    
    public Pelicula(String t, String d, Fecha f, String pO, Integer v){
       this.titulo = t;
       this.descripcion = d;
       this.setFechaEstreno(f);
       this.paisOrigen = pO;
       this.visualizaciones = v;
    }

    public Integer getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(Integer visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Fecha getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Fecha fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    } 
    
    public void visualizar(){
        this.visualizaciones++;
    }
    
    public Double calcularPuntaje(){
       return (visualizaciones * 1000.0)/(2023 - fechaEstreno.getAnio());
    }

    public String toString(){
        return "Pelicula: "+ titulo+"\n"+
               "\tDescripcion: " + descripcion + "\n" +
               "\tFecha de estreno: " + fechaEstreno + "\n" +
               "\tPais de origen: " + paisOrigen + "\n" +
               "\tVisualizaciones: " + visualizaciones + "\n" + 
               "\tPuntaje: " + calcularPuntaje();

    }
}
