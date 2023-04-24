package Sueldos.Clases;

public class Sueldo {
    private String mes;
    private Double sueldoNeto;
    private Bono bonoP;
    private Bono bonoR;

    public Bono getBonoP() {
        return bonoP;
    }

    public void setBonoP(Bono bonoP) {
        this.bonoP = bonoP;
    }

    public Bono getBonoR() {
        return bonoR;
    }

    public void setBonoR(Bono bonoR) {
        this.bonoR = bonoR;
    }

    public Double getSueldoNeto() {
        return sueldoNeto;
    }
    
    public void setSueldoNeto(Double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
