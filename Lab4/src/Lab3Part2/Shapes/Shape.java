package Lab3Part2.Shapes;

public class Shape {
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
