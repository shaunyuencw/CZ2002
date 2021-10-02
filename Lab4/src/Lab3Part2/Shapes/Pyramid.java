package Lab3Part2.Shapes;

public class Pyramid extends Shape{
    private Square base;
    private double height;

    public Pyramid(int numOfEdges, double width, double height){
        super(numOfEdges);
        base = new Square(4, width);
        this.height = height;
    }

    public double volume(){
        return base.area() * (height / 3);
    }
}
