package Clases;

public class Mesa extends Mueble {
    private int patas;

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    private String materialTabla;

    public String getMaterialTabla() {
        return materialTabla;
    }

    public void setMaterialTabla(String materialTabla) {
        this.materialTabla = materialTabla;
    }

    private String forma;

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Mesa(int alto, int largo, int ancho, String color, double precio, int patas, String materialTabla,
            String forma) {
        super(alto, largo, ancho, color, precio);
        this.patas = patas;
        this.materialTabla = materialTabla;
        this.forma = forma;
    }
}