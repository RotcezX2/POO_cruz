package Figuras;

public class Square {
    private double side;

    public double getPerimeter(){
        //double perimeter = 4 * side;
        return 4 * side;
    }

    public void setSide(double side){
        this.side = side;
}

    public double getArea() {
        return side * side;
    }
    public void getArea (double side) {
        this.side = side;
    }
}