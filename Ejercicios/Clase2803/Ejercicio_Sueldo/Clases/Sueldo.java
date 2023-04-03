package Ejercicios.Clase2803.Ejercicio_Sueldo.Clases;

public class Sueldo {
    private Presentismo p;
    private Resultado r;
    
    public Double presentismo(Integer ausente){
        return p.calcularPresentismo(ausente);
    }

    public Double bonoXResultado(Double neto){
        if(r.getOpcion() == 1){
            return r.calcularBonoXPorcenje(neto);
        }

        if (r.getOpcion() == 2) {
            return r.calcularBonoFijo(neto);
        }
        return 0.0;
    }
}
