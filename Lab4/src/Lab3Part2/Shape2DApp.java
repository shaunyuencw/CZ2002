package Lab3Part2;
import Lab3Part2.Shapes.*;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] customShape;

        System.out.println("Enter total number of shapes: ");
        int totalShapes = sc.nextInt();
        customShape = new Shape[totalShapes];
        int shapesAdded = 0;

        do{
            System.out.println("What shape are you adding: ");
            String shape = sc.next();

            switch(shape){
                case "Circle": case "circle":
                    System.out.println("Enter radius: ");
                    double radius = sc.nextDouble();
                    customShape[shapesAdded++] = new Circle(1, radius);
                    break;
                case "Rectangle": case "rectangle":
                    System.out.println("Enter length: ");
                    double length = sc.nextDouble();

                    System.out.println("Enter breadth: ");
                    double breadth = sc.nextDouble();

                    customShape[shapesAdded++] = new Rectangle(4, length, breadth);
                break;
                case "Square": case "square":
                    System.out.println("Enter width: ");
                    double width = sc.nextDouble();

                    customShape[shapesAdded++] = new Square(4, width);
                    break;
                case "Triangle": case "triangle":
                    System.out.println("Enter base: ");
                    double base = sc.nextDouble();

                    System.out.println("Enter height: ");
                    double height = sc.nextDouble();
                    
                    customShape[shapesAdded++] = new Triangle(3, base, height);
                    break;
                default:
                    System.out.println("No such shape registered, try again.");
            }
        } while (shapesAdded < totalShapes);

        double totalArea = 0;
        for (int i = 0; i < customShape.length; i++) {
            totalArea += customShape[i].area();
        }
    
        System.out.printf("Custom shape's area is %.2f", totalArea);
        sc.close(); 
    }
        // TODO Choose the type of calculation (for now, we will just calculate Area, with future plans to calculate Volume as well)
}
