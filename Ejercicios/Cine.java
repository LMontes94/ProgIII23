package Ejercicios;

public class Cine {
    private String pelicula;
    private String horario;

    public String getPelicula(){
        return pelicula;
    }

    public void setPelicula(String pelicula){
       this.pelicula = pelicula;
    }

    public String getHorario(){
        return horario;
    }

    public void setHorario(String horario){
       this.horario = horario;
    }

    public void obtenerCartelera() {
        this.getHorario();
        this.getPelicula();
        System.out.println("Pelicula: " + this.getPelicula());
        System.out.println("Horario: " + this.getHorario());
    }
}
