package Clases;

public class Silla extends Mueble {
    private boolean tapizada;

    public boolean isTapizada() {
        return tapizada;
    }

    public void setTapizada(boolean tapizada) {
        this.tapizada = tapizada;
    }

    private String materialTapizado;

    public String getMaterialTapizado() {
        return materialTapizado;
    }

    public void setMaterialTapizado(String materialTapizado) {
        this.materialTapizado = materialTapizado;
    }

    public Silla(int alto, int largo, int ancho, String color, double precio, boolean tapizada,
            String materialTapizado) {
        super(alto, largo, ancho, color, precio);
        this.tapizada = tapizada;
        this.materialTapizado = materialTapizado;
    }

    @Override
    public double calcularPrecio() {
        double precioSilla = super.calcularPrecio();
        if (tapizada) {
            precioSilla += 50; // Supongamos un costo extra por tapizado
        }
        return precioSilla;
    }
}

/*
 * class Silla(Mueble):
 * def __init__(self, alto, largo, ancho, color, precio, tapizada=False,
 * materialTapizado=""):
 * super().__init__(alto, largo, ancho, color, precio)
 * self.tapizada = tapizada
 * self.materialTapizado = materialTapizado
 * 
 * def calcularPrecio(self):
 * precio_silla = super().calcularPrecio()
 * if self.tapizada:
 * precio_silla += 50 # Supongamos un costo extra por tapizado
 * return precio_silla
 */
