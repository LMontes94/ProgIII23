package Ejercicios.Patrones.Robot.clases.builder;

class Robot {
    private Integer POTENCIA_BASE = 10;
    private Integer nroSerie;
    private Traccion traccion;
    private Integer resistencia;
    private Arma arma;

    public Robot() {

    }

    public Robot(Integer nroSerie, Traccion t, Integer r, Arma a) {
        this.nroSerie = nroSerie;
        this.traccion = t;
        this.resistencia = r;
        this.arma = a;
    }

    public Robot(Integer nroSerie, Integer r) {
        this.nroSerie = nroSerie;
        this.resistencia = r;
    }

    public Integer getNroSerie() {
        return this.nroSerie;
    }

    public Traccion getTraccion() {
        return this.traccion;
    }

    public Integer getResistencia() {
        return this.resistencia;
    }

    public Arma getArma() {
        return this.arma;
    }

    public Integer getPotenciaBase() {
        return this.POTENCIA_BASE;
    }

    public void setResistencia(Integer r) {
        this.resistencia = r;
    }

    public void setTraccion(Traccion t) {
        this.traccion = t;
    }

    public void setArma(Arma a) {
        this.arma = a;
    }

    public void setNroSerie(Integer n) {
        this.nroSerie = n;
    }
}