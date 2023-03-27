package Ejercicios.Ejercicio13;

public class Oruga extends Traccion {
    
    private String sensor = "Meke-M0";

    public String getSensor(){
       return sensor;
    }

    public void setSensor(String sensor){
       this.sensor = sensor;
    }
    
    public void cambiarRodado(int kmRecorridos){
        this.setRodado(400);
        if (this.calcularRodado(kmRecorridos) < 1) {
          System.out.println("Cambiar oruga urgente!!!!");
        }
       }
}
