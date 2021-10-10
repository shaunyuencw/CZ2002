package Lab4Part2;
import java.util.Scanner;

import Lab4Part2.Shapes.*;

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
                    customShape[shapesAdded++] = new Circle();
                    break;
                case "Rectangle": case "rectangle":
                    customShape[shapesAdded++] = new Rectangle();
                break;
                case "Square": case "square":
                    customShape[shapesAdded++] = new Square();
                    break;
                case "Triangle": case "triangle":
                    customShape[shapesAdded++] = new Triangle();
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
