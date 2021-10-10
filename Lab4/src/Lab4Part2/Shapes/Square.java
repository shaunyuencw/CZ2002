package Lab4Part2.Shapes;

public class Square extends Shape{
    private double width;

    public Square() {
        super(4);
        System.out.println("Enter width: ");
        this.width = sc.nextDouble();
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
