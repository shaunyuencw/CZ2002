package Lab4Part2.Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        super(1);
        System.out.println("Enter radius: ");
        this.radius = sc.nextDouble();
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
