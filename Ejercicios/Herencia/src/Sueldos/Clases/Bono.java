package Sueldos.Clases;

public abstract class Bono {
    private char opcion;
    private Integer valor;

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public char getOpcion() {
        return opcion;
    }

    public void setOpcion(char opcion) {
        this.opcion = opcion;
    }
    
}
