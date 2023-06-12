package Ejercicios.Patrones.Robot.clases.builder;

import Ejercicios.Patrones.Robot.clases.Excepciones.RobotSinResistenciaException;

public class Espada implements Arma {

    private Integer DANIO = 3;
    private String nombre;

    public Espada() {
        this.nombre = "Espada";
    }

    @Override
    public void atacar(Robot r) throws RobotSinResistenciaException {
        if (r.getResistencia() < this.DANIO) {
            throw new RobotSinResistenciaException("El robot no puede seguir con la pelea!!!");
        }
        r.setResistencia(this.calcularDanio(r));
    }

    @Override
    public Integer calcularDanio(Robot r) {
        return r.getResistencia() - this.DANIO;
    }

    @Override
    public Double calcularDanioTraccion(Robot r) {
        return (r.getTraccion().getKm() * 2) / 100;
    }

    public String getNombre() {
        return this.nombre;
    }

}
