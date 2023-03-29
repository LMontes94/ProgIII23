package Ejercicios.Clase2803; 

 public class Circulo extends FiguraGeometrica{
    private Integer radio;

    public Integer getRadio(){
        return radio;
    }

    public void setRadio(Integer radio){
        this.radio =  radio;
    }

    public Double calcularPerimetro(){
        return 3.14 * (this.radio * 2);
    }

    public Double calcularArea(){
        return 3.14 * (this.radio * this.radio);
    }
}
