package Ejercicios.Ejercicio14;

import Ejercicios.Ejercicio14.Clases.BrazoRobotico;
import Ejercicios.Ejercicio14.Clases.Dron;
import Ejercicios.Ejercicio14.Clases.Herramienta;
import Ejercicios.Ejercicio14.Clases.SensorInfrarrojo;
import Ejercicios.Ejercicio14.Clases.Taser;

public class main {
    public static void main(String[] args) {
        
       Dron dr1 = new Dron();
       Herramienta sensorInfra = new SensorInfrarrojo();

       dr1.setHerramienta(sensorInfra);
       dr1.getHerramienta().pesoFijo();
       dr1.getHerramienta().nombre();
       dr1.alturaFinal();
       dr1.velocidadFinal();
       
       System.out.println("Dron");
       System.out.println("Velocidad: " + dr1.velocidadFinal());
       System.out.println("Altura: " + dr1.alturaFinal());
       System.out.println("Herramienta: " + dr1.getHerramienta().getNombre());
       System.out.println("--------------------------------------------");
       
       Herramienta Teaser = new Taser();
       dr1.setHerramienta(Teaser);
       dr1.getHerramienta().pesoFijo();
       dr1.getHerramienta().nombre();
       dr1.alturaFinal();
       dr1.velocidadFinal();
       
       System.out.println("--------------------------------------------");
       System.out.println("Dron");
       System.out.println("Velocidad: " + dr1.velocidadFinal());
       System.out.println("Altura: " + dr1.alturaFinal());
       System.out.println("Herramienta: " + dr1.getHerramienta().getNombre());
       System.out.println("--------------------------------------------");
       
       Herramienta BrRobotico = new BrazoRobotico();
       dr1.setHerramienta(BrRobotico);
       dr1.getHerramienta().pesoFijo();
       dr1.getHerramienta().nombre();
       dr1.alturaFinal();
       dr1.velocidadFinal();
       
       System.out.println("--------------------------------------------");
       System.out.println("Dron");
       System.out.println("Velocidad: " + dr1.velocidadFinal());
       System.out.println("Altura: " + dr1.alturaFinal());
       System.out.println("Herramienta: " + dr1.getHerramienta().getNombre());
       System.out.println("--------------------------------------------");
    }
}
