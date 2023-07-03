package Clases;

public class Mueble {

    private Integer alto;

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    private Integer largo;

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    private Integer ancho;

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Double precio;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Mueble(int alto, int largo, int ancho, String color, double precio) {
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
        this.color = color;
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio;
    }
}
