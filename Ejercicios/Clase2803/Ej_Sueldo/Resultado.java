package Ejercicios.Clase2803.Ej_Sueldo;

public class Resultado {
    private Integer opcion;

    public Integer getOpcion(){
        return opcion;
    }

    public void setOpcion(Integer opcion){
       this.opcion = opcion;
    }

    public Double calcularBonoXPorcenje(Double sueldo){
        return (sueldo * 10)/100;
    }

    public Double calcularBonoFijo(Double sueldo){
       return sueldo + 80;
    }
}
