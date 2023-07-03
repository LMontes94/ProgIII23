import Clases.*;

public class Main {
    public static void main(String[] args) {
        Mesa mesaComedor = new Mesa(75, 120, 80, "marrón", 200, 4, "madera", "rectangular");
        Silla sillaComedor1 = new Silla(90, 40, 40, "blanco", 50, true, "tela");
        Silla sillaComedor2 = new Silla(90, 40, 40, "blanco", 50, true, "tela");
        Silla sillaComedor3 = new Silla(90, 40, 40, "blanco", 50, true, "tela");
        Silla sillaComedor4 = new Silla(90, 40, 40, "blanco", 50, true, "tela");

        Combo comboComedorEstandar = new Combo("Comedor Estándar", 10);
        comboComedorEstandar.agregarMueble(mesaComedor);
        comboComedorEstandar.agregarMueble(sillaComedor1);
        comboComedorEstandar.agregarMueble(sillaComedor2);
        comboComedorEstandar.agregarMueble(sillaComedor3);
        comboComedorEstandar.agregarMueble(sillaComedor4);

        double precioPedido = comboComedorEstandar.calcularPrecio();
        System.out.println("Precio total del pedido: $" + precioPedido);
    }
}
