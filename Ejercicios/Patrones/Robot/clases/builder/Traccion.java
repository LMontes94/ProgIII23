package Ejercicios.Patrones.Robot.clases.builder;

import Ejercicios.Patrones.Robot.clases.Excepciones.SistemaTraccionDeterioradoException;

public interface Traccion {
    public void avanzar(Double km) throws SistemaTraccionDeterioradoException;

    public Double deterioroPropulsion(Double km);

    public Integer calcularTraccionBase(Robot r);

    public Double getKm();

}
