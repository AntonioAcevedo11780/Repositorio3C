package Model;

public class TriangleEquilatero extends FigureAbs {

    private double height;
    private double side;

    public TriangleEquilatero( double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

}

