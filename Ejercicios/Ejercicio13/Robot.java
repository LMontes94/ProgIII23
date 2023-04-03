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
        
        if (this.traccion.getEntorno() == "Rueda") {
            this.traccion.setHp(1);
            return this.potencia - this.traccion.getHp();
        }else{
            this.traccion.setHp(3);
            return this.potencia - this.traccion.getHp();
        }
    }

}
