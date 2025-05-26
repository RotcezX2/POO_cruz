package Figuras;

public class Triangulo {
    private double Height;
    private double Base;

    public double getPerimeter(){
        return Height + Base + Height;
    }

    public double getArea(){
        return (Base * Height);
    }

    public void setBase(double base){
        this.Base = base;
    }

    public void setHeight(double height){
        this.Height = height;
    }

}
