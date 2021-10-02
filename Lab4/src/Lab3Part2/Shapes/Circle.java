package Lab3Part2.Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(int numOfEdges, double radius){
        super(numOfEdges);
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
