package Clases;

public class Sillon extends Mueble {
    private String materialTapizado;

    public String getMaterialTapizado() {
        return materialTapizado;
    }

    public void setMaterialTapizado(String materialTapizado) {
        this.materialTapizado = materialTapizado;
    }

    public Sillon(int alto, int largo, int ancho, String color, double precio, String materialTapizado) {
        super(alto, largo, ancho, color, precio);
        this.materialTapizado = materialTapizado;
    }
}
