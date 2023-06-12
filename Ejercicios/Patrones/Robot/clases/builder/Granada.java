package Ejercicios.Patrones.Robot.clases.builder;

public class Granada implements Arma {
    private Integer DANIO = 35;
    private String nombre;

    public Granada() {
        this.nombre = "Granada";
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
