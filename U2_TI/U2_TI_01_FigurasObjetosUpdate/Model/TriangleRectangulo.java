package Model;

public class TriangleRectangulo extends FigureAbs {

    private double base;
    private double height;
    private double side;
    private double side2;
    private double side3;

    public TriangleRectangulo(double side, double side2 , double side3) {
        this.side = side;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return (side * side2 ) / 2;
    }

    @Override
    public double getPerimeter() {
        return side + side2 + side3;
    }

}
