package Ejercicio16.src.Clases.Elemento;

public class Bicicleta extends Elemento {
    private Double tamanio;
    private boolean esElectrica;
    private Integer cantCambios;

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    public Integer getCantCambios() {
        return cantCambios;
    }

    public void setCantCambios(Integer cantCambios) {
        this.cantCambios = cantCambios;
    }

}
