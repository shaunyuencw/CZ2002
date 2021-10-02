package Lab3Part2.Shapes;

public class Cylinder extends Shape{
    private double height;
    private Circle base;

    public Cylinder(int numOfEdges, double radius, double height){
        super(2);
        base = new Circle(1, radius);
        this.height = height;
    }

    public double volume(){
        return base.area() * height;
    }
}
