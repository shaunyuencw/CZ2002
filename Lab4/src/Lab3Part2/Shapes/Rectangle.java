package Lab3Part2.Shapes;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(int numOfEdges, double length, double breadth){
        super(numOfEdges);
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(double length){
        this.length = length;
    }
    
    public void setBreadth(double breadth){
        this.breadth = breadth;
    }

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    public double area() {
        return length * breadth;
    }
}
