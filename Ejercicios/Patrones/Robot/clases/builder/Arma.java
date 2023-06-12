package Ejercicios.Patrones.Robot.clases.builder;

import Ejercicios.Patrones.Robot.clases.Excepciones.RobotSinResistenciaException;

public interface Arma {
    public void atacar(Robot r) throws RobotSinResistenciaException;

    public Integer calcularDanio(Robot r);

    public Double calcularDanioTraccion(Robot r);
}
