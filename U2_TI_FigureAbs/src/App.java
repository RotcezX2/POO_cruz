import Model.*;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs tri = new Triangle(20, 25, 20);
        FigureAbs eq = new Equilateral(15, 15);
        FigureAbs rec = new TrRectangle(16, 12, 25);


        FigureAbs[] figures = { sq, cir, tri, eq, rec };

        for (FigureAbs figureAbs : figures) {
            System.out.println("\n----------------------------------------------------");
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}
