package Lab4Part2.Shapes;

public class Pyramid extends Shape{
    private Square base;
    private double height;

    public Pyramid(){
        super(8);
        base = new Square();
        System.out.println("Enter height: ");
        this.height = sc.nextDouble();
    }

    public double volume(){
        return base.area() * (height / 3);
    }
}
