package Lab4Part2.Shapes;

public class Cuboid extends Shape{
    private double height;
    private Rectangle base;

    public Cuboid(){
        super(12);
        base = new Rectangle();
        System.out.println("Enter height: ");
        this.height = sc.nextDouble();
    }

    public double volume(){
        return base.area() * height;
    }
}
