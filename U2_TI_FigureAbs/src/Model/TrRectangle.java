package Model;

public class TrRectangle extends FigureAbs {

    private double cat1;
    private double cat2;
    private double hipo;

    public TrRectangle(double cat1, double cat2, double hipo) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.hipo = hipo;
    }

    public double getArea() {
        return (cat2 * cat1) / 2;
    }

    public double getPerimeter() {
        return cat1 + cat2 + hipo;
    }

}
