package Lab3Part2.Shapes;

public class Triangle extends Shape{
    private double height = 0;
    private double base;

    public Triangle(int numOfEdges, double height, double base) {
        super(numOfEdges);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area() {
        return 0.5 * base * height;
    }
}
