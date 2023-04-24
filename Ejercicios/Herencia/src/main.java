import Celulares.Clases.Iphone;
import Celulares.Clases.Motorola;
import Celulares.Clases.Persona;

public class main {
    
    public static void main(String[] args) {
        Persona catalina = new Persona();
        Persona juliana = new Persona();

        catalina.setNombre("Calatina");
        catalina.setCelular(new Motorola());

        juliana.setNombre("Juliana");
        juliana.setCelular(new Iphone());
        
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        juliana.getCelular().setDuracionLlamada(16.0);
        juliana.getCelular().llamada();
        juliana.getCelular().setDuracionLlamada(5.0);
        juliana.getCelular().llamada();
        juliana.getCelular().setDuracionLlamada(4.0);
        juliana.getCelular().llamada();
        juliana.getCelular().setDuracionLlamada(7.0);
        juliana.getCelular().llamada();

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        catalina.getCelular().llamada();
        catalina.getCelular().llamada();
        catalina.getCelular().llamada();
        catalina.getCelular().llamada();
        catalina.getCelular().llamada();
        catalina.getCelular().llamada();
        catalina.getCelular().llamada();
        
        System.out.println(juliana.getNombre());
        juliana.getCelular().consultarBateria();
        System.out.println(catalina.getNombre());
        catalina.getCelular().consultarBateria();

        juliana.getCelular().cargarBateria();
        catalina.getCelular().cargarBateria();

        juliana.getCelular().consultarBateria();
        catalina.getCelular().consultarBateria();
    }
}
