package Coleccion.Promedios;

import java.util.ArrayList;

public class Nota extends ArrayList<Integer> {
    
    public void mostrarNotas(){
      int i;
      for(i = 0;i < this.size(); i++){
         System.out.println("Nota " + (i + 1) + ": "+ this.get(i)); 
      }
    }
}
