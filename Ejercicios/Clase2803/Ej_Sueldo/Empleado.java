package Ejercicios.Clase2803.Ej_Sueldo;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private Integer diasAusentes;
    private Categoria categoria;
    private Presentismo bonoP;
    private Resultado bonoR;
    private Sueldo sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Integer getDiasAusentes() {
        return diasAusentes;
    }

    public void setDiasAusentes(Integer diasAusentes) {
        this.diasAusentes = diasAusentes;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria c){
        this.categoria = c;
    }

    public Presentismo getPresentismo(){
        return bonoP;
    }

    public void setPresentismo(Presentismo p){
        this.bonoP = p;
    }

    public Resultado getResultado(){
        return bonoR;
    }

    public void setResultado(Resultado r){
        this.bonoR = r;
    }

    public Double getSueldo(){
       return this.sueldo.calcularSueldo(this);
    }

    public void setSueldo(Sueldo s){
        this.sueldo = s;
    }
}
