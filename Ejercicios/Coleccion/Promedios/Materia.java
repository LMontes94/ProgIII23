package Coleccion.Promedios;

public class Materia {
    private Integer codigo;
    private String nombre;
    private boolean puedoCursar;

    public boolean isPuedoCursar() {
        return puedoCursar;
    }

    public void setPuedoCursar(boolean estado) {
        this.puedoCursar = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object obj) {
        Materia otra = (Materia)obj;
        return this.codigo == otra.codigo;
    }
}
