package Lab4Part2.Shapes;

public class Cone extends Shape{
    private Circle base;
    private double height;

    public Cone(){
        super(1);
        base = new Circle();
        System.out.println("Enter height: ");
        this.height = sc.nextDouble();
    }

    public double volume(){
        return base.area() * (height / 3);
    }
    
}
