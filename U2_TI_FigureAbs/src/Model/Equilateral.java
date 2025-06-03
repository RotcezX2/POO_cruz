package Model;

public class Equilateral extends FigureAbs{

    private double side;
    private double height;

    public Equilateral(double height, double side) {
        this.side = side;
        this.height = height;
    }

    public double getArea() {
        return (side * height) / 2;
    }

    public double getPerimeter() {
        return 3 * side;
    }

}
