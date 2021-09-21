import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.printf("Height: ");
            int height = sc.nextInt();
            int temp = 0;

            if (height == 0){
                System.out.println("Input error!");
            }
            else {
                for (int i = 1; i <= height; i++){
                    for(int j = 0; j < i; j++){
                        if (temp % 2 == 0){
                            System.out.print("AA");
                        }
                        else{
                            System.out.print("BB");
                        }
                        temp++;
                    }
                    if (i % 2 == 0){
                        temp++;
                    }
                    System.out.printf("\n");
                }
            }  

            System.out.println("Would you like to continue? N to quit: ");
            if (sc.next().equals("N")){
                System.out.println("Exitting program! :)");
                break;
            }
        }
        

        sc.close();
    }

    void printSomething(){

    }
}
