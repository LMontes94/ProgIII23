package Ejercicio16.src.Clases.Elemento.Electrodomesticos;

public class Lavarropa extends Electrodomestico {
    private Integer carga;
    private Integer revolCentrifugado;

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Integer getRevolCentrifugado() {
        return revolCentrifugado;
    }

    public void setRevolCentrifugado(Integer revolCentrifugado) {
        this.revolCentrifugado = revolCentrifugado;
    }
}
