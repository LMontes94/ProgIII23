package Ejercicios.Clase2803;

public class main {
    
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
    
        cuadrado.setLado(4);
        triangulo.setAltura(3);
        triangulo.setBase(4);
        triangulo.setHipotenusa(5);
        circulo.setRadio(5);
        
        System.out.println("Perimetro del cuadrado: "+cuadrado.calcularPerimetro());
        System.out.println("Area del cuadrado" + cuadrado.calcularArea());

        System.out.println("Perimetro del triangulo: " + triangulo.calcularPerimetro());
        System.out.println("Area del Triangulo: " + triangulo.calcularArea());

        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());
        System.out.println("Area del circulo: " + circulo.calcularArea());




    }
}
