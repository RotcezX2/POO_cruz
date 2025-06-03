package Model;

public class Triangle extends FigureAbs {

    private double base;
    private double height;
    private double side;

    public Triangle(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public double getPerimeter() {
        return 2 * side + base;
    }

}
