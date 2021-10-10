package Lab4Part2.Shapes;

public class Cylinder extends Shape{
    private double height;
    private Circle base;

    public Cylinder(){
        super(2);
        base = new Circle();
        System.out.println("Enter height: ");
        this.height = sc.nextDouble();
    }

    public double volume(){
        return base.area() * height;
    }
}
