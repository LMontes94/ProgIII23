package Ejercicio16.src.Clases.Elemento;

public abstract class Elemento {
    private Integer id;
    private Double dimension;
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDimension() {
        return dimension;
    }

    public void setDimension(Double dimension) {
        this.dimension = dimension;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
