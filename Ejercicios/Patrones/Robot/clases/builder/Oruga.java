package Ejercicios.Patrones.Robot.clases.builder;

import Ejercicios.Patrones.Robot.clases.Excepciones.SistemaTraccionDeterioradoException;

public class Oruga implements Traccion {

    private Integer HP = 3;
    private Double MAX_DURACION = 400.0;
    private Double km;
    private Sensor sensor;

    public Oruga() {
        this.km = this.MAX_DURACION;
    }

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
            throw new SistemaTraccionDeterioradoException("Necesita cambiar la Oruga!!");
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
