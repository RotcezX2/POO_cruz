package Figuras;

public class Circulo {
    private double radio;
    private double pi = 3.1416;

    public double getPerimeter (){
        return 2 * pi * radio;
    }

    public void setRadio (double radio){
        this.radio = radio;
    }

    public double getArea (){
        return pi * radio * radio;
    }

    public void getArea (double radio){
        this.radio = radio;

    }
}
