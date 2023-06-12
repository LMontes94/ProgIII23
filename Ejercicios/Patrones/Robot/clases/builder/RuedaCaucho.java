package Ejercicios.Patrones.Robot.clases.builder;

import Ejercicios.Patrones.Robot.clases.Excepciones.SistemaTraccionDeterioradoException;

public class RuedaCaucho implements Traccion {
    private Integer HP = 1;
    private Double MAX_DURACION = 100.0;
    private Double km;

    @Override
    public Double deterioroPropulsion(Double km) {
        return this.getKm() - km;
    }

    @Override
    public Integer calcularTraccionBase(Robot r) {
        return r.getPotenciaBase() - this.HP;
    }

    @Override
    public void avanzar(Double km) throws SistemaTraccionDeterioradoException {
        if (this.MAX_DURACION < this.getKm()) {
            throw new SistemaTraccionDeterioradoException("Necesita cambiar la rueda!!");
        }
        this.setKm(deterioroPropulsion(km));
    }

    public Double getKm() {
        return this.km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

}
