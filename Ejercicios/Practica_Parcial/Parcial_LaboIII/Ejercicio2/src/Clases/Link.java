package Practica_Parcial.Parcial_LaboIII.Ejercicio2.src.Clases;

public class Link implements TipoDato {
    private String nombre;
    private TipoDato tipoDato;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Integer tamanio() {
        return tipoDato.tamanio();
    }

    public void conectarATipoDato(TipoDato d) {
        this.tipoDato = d;
    }

    public TipoDato getTipoDato(){
        return this.tipoDato;
    }
}
