package Ejercicios.Clase2803.Ej_Sueldo;

public abstract class Categoria {
    private Double sueldoBruto;

    public Double getSueldoBruto(){
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto){
       this.sueldoBruto = sueldoBruto;
    }

    abstract public void sueldoBrutoFijo();
}
