package Lab3Part2;
import Lab3Part2.Shapes.*;
import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] customShape;

        System.out.println("Enter total number of shapes: ");
        int totalShapes = sc.nextInt();
        customShape = new Shape[totalShapes];
        int shapesAdded = 0;
        double length, breadth, height, width, radius;

        do{
            System.out.println("What shape are you adding: ");
            String shape = sc.next();

            switch(shape){
                case "Sphere": case "sphere":
                    System.out.println("Enter radius: ");
                    radius = sc.nextDouble();
                    customShape[shapesAdded++] = new Sphere(1, radius);
                    break;

                case "Pyramid": case "pyramid":
                    System.out.println("Enter width: ");
                    width = sc.nextDouble();
                    System.out.println("Enter height: ");
                    height = sc.nextDouble();

                    customShape[shapesAdded++] = new Pyramid(8, width, height);
                break;
                case "Cuboid": case "cuboid":
                    System.out.println("Enter length: ");
                    length = sc.nextDouble();

                    System.out.println("Enter breadth: ");
                    breadth = sc.nextDouble();

                    System.out.println("Enter height: ");
                    height = sc.nextDouble();

                    customShape[shapesAdded++] = new Cuboid(12, length, breadth, height);
                    break;
                case "Cone": case "cone":
                    System.out.println("Enter radius: ");
                    radius = sc.nextDouble();

                    System.out.println("Enter height: ");
                    height = sc.nextDouble();

                    customShape[shapesAdded++] = new Cone(2, radius, height);
                    break;
                
                case "Cylinder": case "cylinder": 
                    System.out.println("Enter radius: ");
                    radius = sc.nextDouble();

                    System.out.println("Enter height: ");
                    height = sc.nextDouble();

                    customShape[shapesAdded++] = new Cylinder(2, radius, height);
                    break;
                default:
                    System.out.println("No such shape registered, try again.");
            }
        } while (shapesAdded < totalShapes);

        double totalVolume = 0;
        for (int i = 0; i < customShape.length; i++) {
            totalVolume += customShape[i].volume();
        }
    
        System.out.printf("Custom shape's volume is %.2f", totalVolume);
        sc.close(); 
    }
}
