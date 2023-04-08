package Ejercicios.Clase2803.Ejercicio_Sueldo.Clases;

public class Sueldo {
    private Presentismo p;
    private Resultado r;
    
    public Sueldo(){
      this.p = new Presentismo();
      this.r = new Resultado();
    }

    public Presentismo getPresentismo(){
        return p;
    }

    public void setPresentismo(Presentismo p){
        this.p = p;
    }
    
    public Resultado getResultado(){
        return r;
    }

    public void setResultado(Resultado r){
        this.r = r;
    }
    
    public Double presentismo(Integer ausente){
        this.setPresentismo(p);
        return this.getPresentismo().calcularPresentismo(ausente);
    }

    public Double bonoXResultado(Double neto){
        if(r.getOpcion() == 1){
            return this.getResultado().calcularBonoXPorcenje(neto);
        }

        if (r.getOpcion() == 2) {
            return this.getResultado().calcularBonoFijo(neto);
        }
        return 0.0;
    }
}
