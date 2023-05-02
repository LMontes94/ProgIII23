package Practica_Parcial.Parcial_LaboIII.Ejercicio2.src.Exception;

public class DirectorioVacioException extends Exception{

    public DirectorioVacioException(String msj){
       super(msj);
    }

    public String getMessage(){
        return "El directorio esta vacio!!";
    }
}
