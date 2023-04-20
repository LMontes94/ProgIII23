package Coleccion.Promedios;

import java.util.HashSet;

public class Carrera {
    private Integer codigo;
    private String nombre; 
    private HashSet<Materia> materias;
    
    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Materia materia) {
        this.materias.add(materia);
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
        Carrera otra = (Carrera)obj;
        return this.codigo == otra.codigo;
    }

    
}
