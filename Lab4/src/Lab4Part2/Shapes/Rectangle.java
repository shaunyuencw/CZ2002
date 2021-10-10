package Lab4Part2.Shapes;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(){
        super(4);
        System.out.println("Enter length: ");
        this.length = sc.nextDouble();
        System.out.println("Enter breadth: ");
        this.breadth = sc.nextDouble();
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
