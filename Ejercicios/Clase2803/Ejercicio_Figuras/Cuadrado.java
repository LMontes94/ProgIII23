package Ejercicios.Clase2803.Ejercicio_Figuras;


public class Cuadrado {
    private Integer lado;

    public Integer getlado(){
        return lado;
    }

    public void setLado(Integer lado){
        this.lado =  lado;
    }

    public Integer calcularPerimetro(){
        return this.lado * 4;
    }

    public Integer calcularArea(){
        return this.lado * this.lado;
    }
}
