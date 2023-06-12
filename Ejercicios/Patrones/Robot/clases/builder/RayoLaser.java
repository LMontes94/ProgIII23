package Ejercicios.Patrones.Robot.clases.builder;

public class RayoLaser implements Arma {

    private Integer DANIO = 20;
    private String nombre;

    public RayoLaser() {
        this.nombre = "Rayo Laser";
    }

    @Override
    public void atacar(Robot r) {

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
