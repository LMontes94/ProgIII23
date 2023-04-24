package Celulares.Clases;

public class Motorola extends Celular {
    
    public Motorola(){
        this.setMarca("Motorola");
        this.setModelo("G5");
        this.setBateria(this.getMaxBateria());
    }
    private final Double CONSUMO_BATERIA = 0.25;
    @Override
    public void llamada() {
       this.setBateria(this.getBateria() - consumoBateria());
       System.out.println("Llamada finalizada!!");
    }
    
    private Double consumoBateria(){
        return CONSUMO_BATERIA;
    }
}
