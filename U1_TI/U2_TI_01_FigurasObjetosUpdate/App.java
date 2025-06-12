import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.TriangleEquilatero;
import Model.TriangleRectangulo;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs triangleEquilatero = new Model.TriangleEquilatero(20, 25);
        FigureAbs triangleRectangulo = new TriangleRectangulo(20, 25, 20);

        FigureAbs[] figures = { sq, cir, triangle, triangleEquilatero, triangleRectangulo };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}
