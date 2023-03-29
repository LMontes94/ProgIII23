package Ejercicios.Clase2803;

public class Empleado {
    
    private String categoria;
    private Integer diasAusentes;
    private Double neto;

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
       this.categoria = categoria;
    }

    public Integer getDiasAusentes(){
        return diasAusentes;
    }

    public void setDiasAusentes(Integer diasAusentes){
        this.diasAusentes = diasAusentes;
    }

    public Double getNeto(){
        return neto;
    }

    public void setNeto(Double neto){
       this.neto = neto;
    }

    public Double calcularPresentismo(){
        if(this.diasAusentes == 0){
           return (double) (100 * (30 - this.diasAusentes));
        }

        if(this.diasAusentes > 0 && this.diasAusentes < 11){
          return (double) (50 * (30 - this.diasAusentes));
        }

        return (double)(10 * (30 - this.diasAusentes));
    }

    public Double calcularBonoXResultado(){
        return 0.0;
    }

    public Double calcularSueldo(){
       if(this.categoria == "Gerente"){
          this.setNeto(1000.0);
          return (double)(this.getNeto()+ this.calcularPresentismo() + this.calcularBonoXResultado());
       }

       if(this.categoria == "Cadete"){
          this.setNeto(1500.0);
          return (double)(this.getNeto() + this.calcularPresentismo() + this.calcularBonoXResultado());
       }
       return 0.0;
    }
}
