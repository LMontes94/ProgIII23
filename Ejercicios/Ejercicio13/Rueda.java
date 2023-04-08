package Ejercicios.Ejercicio13;

public class Rueda extends Traccion {

  public void cambiarRodado() {
    this.setRodado(100);
    if (this.calcularRodado(this.getRodado()) < 1) {
      System.out.println("Cambiar rueda urgente!!!!");
    }
  }

}
