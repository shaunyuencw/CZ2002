package Lab4Part2;
import java.util.Scanner;

import Lab4Part2.Shapes.*;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape[] customShape;

        System.out.println("Enter total number of shapes: ");
        int totalShapes = sc.nextInt();
        customShape = new Shape[totalShapes];
        int shapesAdded = 0;
        do{
            System.out.println("List of shapes available (Sphere, Pyramid [Square base], Cuboid, Cone, Cylinder)");
            System.out.println("What shape are you adding: ");
            String shape = sc.next();

            switch(shape){
                case "Sphere": case "sphere":
                    customShape[shapesAdded++] = new Sphere();
                    break;

                case "Pyramid": case "pyramid":
                    customShape[shapesAdded++] = new Pyramid();
                break;
                case "Cuboid": case "cuboid":
                    customShape[shapesAdded++] = new Cuboid();
                    break;
                case "Cone": case "cone":
                    customShape[shapesAdded++] = new Cone();
                    break;
                case "Cylinder": case "cylinder": 
                    customShape[shapesAdded++] = new Cylinder();
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
