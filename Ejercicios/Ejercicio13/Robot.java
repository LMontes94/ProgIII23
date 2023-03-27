package Ejercicios.Ejercicio13;

public class Robot {
    private String nroSerie;
    private int potencia = 10;
    private Traccion traccion;

    public String getNroSerie(){
        return nroSerie;
    }

    public void setNroSerie(String nroSerie){
       this.nroSerie = nroSerie;
    }

    public int getPotencia(){
      return potencia;
    }

    public int calcularPotencia(int potencia){
        
        if (this.traccion.getTipoTraccion() == "Rueda") {
            this.traccion.setPotencia(1);
            return this.potencia - this.traccion.getPotencia();
        }else{
            this.traccion.setPotencia(3);
            return this.potencia - this.traccion.getPotencia();
        }
    }

}
