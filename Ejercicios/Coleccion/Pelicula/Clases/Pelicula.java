package Coleccion.Pelicula.Clases;

public class Pelicula {
    
    private String titulo;
    private String descripcion;
    private Fecha fechaEstreno;
    private String paisOrigen;
    private Integer visualizaciones;
    
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
               "Fecha de estreno: " + fechaEstreno + "\n" +
               "Pais de origen: " + paisOrigen + "\n" +
               "Visualizaciones: " + visualizaciones + "\n" + 
               "Puntaje: " + calcularPuntaje();

    }
}
