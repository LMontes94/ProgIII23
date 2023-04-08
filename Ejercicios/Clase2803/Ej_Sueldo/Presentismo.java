package Ejercicios.Clase2803.Ej_Sueldo;

public class Presentismo {
    private boolean bono;

    public boolean getBono(){
        return bono;
    }

    public void setBono(boolean bono){
        this.bono = bono;
    }

    public Double calcularPresentismo(int ausente){
        if(ausente == 0){
            return (double) (100 * (30 - ausente));
         }
 
         if(ausente > 0 && ausente < 11){
           return (double) (50 * (30 - ausente));
         }
 
         return (double)(10 * (30 - ausente));
    }
}
