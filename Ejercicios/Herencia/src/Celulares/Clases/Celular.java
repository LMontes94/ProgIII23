package Celulares.Clases;

public abstract class Celular {
    private final Double MAX_BATERIA = 5.0;
    private String marca;
    private String modelo;
    private Double bateria;
    private Double duracionLlamada;

    public Double getMaxBateria() {
        return MAX_BATERIA;
    }

    public Double getDuracionLlamada() {
        return duracionLlamada;
    }

    public void setDuracionLlamada(Double duracionLlamada) {
        this.duracionLlamada = duracionLlamada;
    }

    public Double getBateria() {
        return bateria;
    }

    public void setBateria(Double bateria) {
        this.bateria = bateria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void consultarBateria() {
        System.out.println("Bateria: " + this.getBateria());
    }
    
    public boolean estaApagado(){
        return this.bateria == 0.0;
    }
    
    public void cargarBateria(){
       this.setBateria(MAX_BATERIA);
       System.out.println("Cargando.....10%");
       System.out.println("Cargando.....25%");
       System.out.println("Cargando.....%50");
       System.out.println("Cargando.....%100");
       System.out.println("Bateria Cargada");
    }
    public abstract void llamada();
}
