package Lab4Part2.Shapes;
import java.util.Scanner;

public class Shape {
    protected static Scanner sc = new Scanner(System.in);
    private int numOfEdges;

    public Shape(int numOfEdges){
        this.numOfEdges = numOfEdges;
    }

    public void setNumOfEdges(int numOfEdges){
        this.numOfEdges = numOfEdges;
    }

    public int getNumOfEdges(){
        return numOfEdges;
    }

    public double area(){
        return 0;
    }

    public double volume(){
        return 0;
    }
}
