package Lab3Part2.Shapes;

public class Square extends Shape{
    private double width;

    public Square(int numOfEdges, double width) {
        super(numOfEdges);
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return width * width;
    }
    
}
