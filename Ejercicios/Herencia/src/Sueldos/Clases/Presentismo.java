package Sueldos.Clases;

public class Presentismo extends Bono {
    private final Integer SIN_FALTAS = 1000;
    private final Integer UNA_FALTA = 450;
    private final Integer BONO_FIJO = 500;
    public void bonoFijo(){
        this.setValor(BONO_FIJO);
    }
    
    public Integer bonoPresentimoUnaFalta(){
       return UNA_FALTA;
    }

    public Integer bonoAsistenciaPerfecta(){
        return SIN_FALTAS;
    }
}
