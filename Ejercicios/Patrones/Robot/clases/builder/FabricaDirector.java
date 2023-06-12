package Ejercicios.Patrones.Robot.clases.builder;

public class FabricaDirector {
    private BuilderRobot robotBuilder;

    public void setRobotBuilder(BuilderRobot robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void construirRobot() {
        robotBuilder.crearNuevoRobot();
        robotBuilder.buildNroSerie();
        robotBuilder.buildResistencia();
        robotBuilder.buildArma();
        robotBuilder.buildTraccion();
    }
}
