package Ejercicios;

public class Ninja {
    private String arteMarcial;
    private String arma;
    private int fuerza;
    private int salto;

    public Ninja(String arteMarcial, String arma, int fuerza, int salto){
        this.arma = arma;
        this.arteMarcial = arteMarcial;
        this.fuerza = fuerza;
        this.salto = salto;
    }

    public String getArteMarcial(){
        return arteMarcial;
    }

    public void setArteMarcial(String arteMarcial){
       this.arteMarcial = arteMarcial;
    }

    public String getArma(){
        return arma;
    }

    public void setArma(String arma){
        this.arma = arma;
    }

    public int getFuerza(){
        return fuerza;
    }

    public void setFuerza(int fuerza){
        this.fuerza = fuerza;
    }

    public int getSalto(){
        return salto;
    }

    public void setSalto(int salto){
        this.salto = salto;
    }

    public void ataque(){
       String arma = this.getArma();
       String arteMarcial = this.getArteMarcial();
       System.out.println("El ninja practica el arte marcial " + arteMarcial + " y usa el arma " + arma + ".");
    }

    public void saltar(int multiplicador){
       float saltoTotal = this.salto*multiplicador;
       System.out.println("Su poder de salto es " + saltoTotal + ".");
    }
}
