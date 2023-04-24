package Celulares.Clases;

public class Iphone extends Celular {
    
    private final Double CONSUMO_BAT_LLAMADA = 0.01;

    public Iphone(){
        this.setMarca("Iphone");
        this.setModelo("");
        this.setBateria(this.getMaxBateria());
    }
    @Override
    public void llamada() {
       this.setBateria(this.getBateria() - calcularConsumoBateria());
       System.out.println("Llamada finalizada!!");
    }

    public  Double calcularConsumoBateria(){
       return this.getDuracionLlamada() * CONSUMO_BAT_LLAMADA;
    }
    
    
}
