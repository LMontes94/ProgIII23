package Ejercicios.Ejercicio13;

public abstract class Traccion {
    private String tipoTraccion;
    private int rodado;
    private int potencia;
    
    public String getTipoTraccion(){
      return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion){
       this.tipoTraccion = tipoTraccion;
    }

    public int getRodado(){
      return rodado;
    }

    public void setRodado(int rodado){
       this.rodado = rodado;
    }

    public int getPotencia(){
      return potencia;
    }

    public void setPotencia(int potencia){
      this.potencia = potencia;
    }

    public int calcularRodado(int kmRecorridos){
       return kmRecorridos - this.rodado;
    }

  
}
