package Lab3Part2.Shapes;

public class Sphere extends Shape{
    private Circle base;

    public Sphere(int numOfEdges, double radius){
        super(numOfEdges);
        base = new Circle(1, radius);
    }

    public double volume() {
        return 4/3 * Math.PI * Math.pow(base.getRadius(), 3);
    }

    public double area() {
        return 4 * Math.PI * Math.pow(base.getRadius(), 2);
    }
}
