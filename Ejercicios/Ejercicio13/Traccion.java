package Ejercicios.Ejercicio13;

public abstract class Traccion {
    private String entorno;
    private int rodado;
    private int hp;
    
    public String getEntorno(){
      return entorno;
    }

    public void setEntorno(String tipoTraccion){
       this.entorno = tipoTraccion;
    }

    public int getRodado(){
      return rodado;
    }

    public void setRodado(int rodado){
       this.rodado = rodado;
    }

    public int getHp(){
      return hp;
    }

    public void setHp(int potencia){
      this.hp = potencia;
    }

    public int calcularRodado(int kmRecorridos){
       return kmRecorridos - this.rodado;
    }

  
}
