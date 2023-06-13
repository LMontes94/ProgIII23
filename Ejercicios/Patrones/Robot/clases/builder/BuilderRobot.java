package Ejercicios.Patrones.Robot.clases.builder;

public abstract class BuilderRobot {
    protected Robot robot;

    public void crearNuevoRobot() {
        this.robot = new Robot();
    }

    public Robot getRobot() {
        return this.robot;
    }

    public abstract void buildArma();

    public abstract void buildTraccion();

    public abstract void buildResistencia();

    public abstract void buildNroSerie();
}
