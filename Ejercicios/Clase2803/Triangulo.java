package Ejercicios.Clase2803;

public class Triangulo {
    private Integer base;
    private Integer altura;
    private Integer hipotenusa;

    public Integer getBase(){
        return base;
    }

    public void setBase(Integer lado){
        this.base =  lado;
    }
    public Integer getAltura(){
        return altura;
    }

    public void setAltura(Integer lado){
        this.altura =  lado;
    }
    public Integer getHipotenusa(){
        return hipotenusa;
    }

    public void setHipotenusa(Integer lado){
        this.hipotenusa =  lado;
    }

    public Integer calcularPerimetro(){
        return this.base + this.altura + this.hipotenusa;
    }

    public Integer calcularArea(){
        return (this.base * this.altura)/2;
    }
}
