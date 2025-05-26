package Figuras;

public class App {
    public static void main (String[] args) throws Exception{

        Square sq = new Square();
        sq.setSide(5);
        System.out.println("Cuadrado");
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());
        sq.getArea(5);

        Circulo cr = new Circulo();
        cr.setRadio(5);
        System.out.println("Circulo");
        System.out.println(cr.getPerimeter());
        System.out.println(cr.getArea());
        sq.getArea(5);

        Triangulo tri = new Triangulo();
        tri.setBase(7);
        tri.setHeight(5);
        System.out.println("Triangulo Isosceles");
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());
    }
}