import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            char cIn = sc.next().charAt(0);
            switch(cIn){
                case 'a':
                case 'A':
                    System.out.printf("Action movie fan \n");
                    break;
                case 'c':
                case 'C':
                    System.out.printf("Comedy movie fan\n");
                    break;
                case 'd':
                case 'D':
                    System.out.printf("Drama movie fan\n");
                    break;
                default:
                    System.out.printf("Invalid choice\n");
            }
            System.out.println("Do you want to continue? (Y/N)");
            if (sc.next().charAt(0) == 'N'){
                System.out.println("Exiting program. :)");
                break;
            }
        }
        sc.close();
    }
}
