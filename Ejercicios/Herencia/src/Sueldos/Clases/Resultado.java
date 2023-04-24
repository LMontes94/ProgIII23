package Sueldos.Clases;

public class Resultado extends Bono {
    
    private final Double PORCENTAJE_FIJO = 0.1;
    private final Integer VALOR_FIJO = 800;

    public Double calcular100PorObjCumplido(Empleado e){
        return e.getSueldo().getSueldoNeto()+(e.getSueldo().getSueldoNeto() * PORCENTAJE_FIJO);
    }

    public Double calcular80PorObjCumplido(Empleado e){
       return e.getSueldo().getSueldoNeto() + VALOR_FIJO;
    }
}
