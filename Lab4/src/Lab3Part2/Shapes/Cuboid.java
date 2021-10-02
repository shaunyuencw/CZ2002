package Lab3Part2.Shapes;

public class Cuboid extends Shape{
    private double height;
    private Rectangle base;

    public Cuboid(int numOfEdges, double length, double breadth, double height){
        super(numOfEdges);
        base = new Rectangle(4, length, breadth);
        this.height = height;
    }

    public double volume(){
        return base.area() * height;
    }
}
