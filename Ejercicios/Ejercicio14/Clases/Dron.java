package Ejercicios.Ejercicio14.Clases;

public class Dron {
    private final Double peso = 200.0;
    private final Double altura = 100.0;
    private final Double velocidad = 5.0;
    private Herramienta h;

    public Double getPeso(){
        return peso;
    }

    public Double getAltura(){
        return altura;
    }

    public Double getVelocidad(){
        return velocidad;
    }

    public Herramienta getHerramienta(){
        return h;
    }

    public void setHerramienta(Herramienta h){
        this.h = h;
    }
    
    public Double calcularPeso(){
       return this.getHerramienta().getPeso() - this.getPeso();
    }
    
    public Double calcularGrExtras(){
       return calcularPeso()/50;
    }

    public Double alturaFinal(){
        Double alturaF = 0.0;
        Double cantGrExtra = calcularGrExtras();

        alturaF = this.getAltura() - ((this.getAltura()*(5*cantGrExtra))/100);
        return alturaF;
    }

    public Double velocidadFinal(){
        Double vFinal = 0.0;
        Double cantGrExtra = calcularGrExtras();

        vFinal = this.getVelocidad() - ((this.getVelocidad()*(2*cantGrExtra))/100);
        return vFinal;
    }
}
