package Lab3Part2.Shapes;

public class Cone extends Shape{
    private Circle base;
    private double height;

    public Cone(int numOfEdges, double radius, double height){
        super(numOfEdges);
        base = new Circle(1, radius);
        this.height = height;
    }

    public double volume(){
        return base.area() * (height / 3);
    }
    
}
