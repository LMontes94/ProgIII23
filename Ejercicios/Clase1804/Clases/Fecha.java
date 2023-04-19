package Clase1804.Clases;

public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;
    
    public Fecha(int d,int m, int a){
       this.dia = d;
       this.mes = m;
       this.anio = a;
    }
    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }

    public boolean equals(Object o){
      Fecha otra = (Fecha)o;
      return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
    }
}
