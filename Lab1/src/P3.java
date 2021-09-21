import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Starting: ");
        int start = sc.nextInt();

        System.out.printf("Ending: ");
        int end = sc.nextInt();


        System.out.printf("Increment: ");
        int inc = sc.nextInt();

        while(true){
            System.out.printf("Loop Style (for, while, dowhile): ");
            String userMethod = sc.next();

            if (userMethod.equals("for") || userMethod.equals("while") || userMethod.equals("dowhile")){
                
                disConvTable(start, end, inc, userMethod); // Generate using for loop
            }
            else{
                System.out.println("Invalid Loop Style");
            }

            System.out.println("Would you like to continue? N to quit: ");
            
            if (sc.next().equals("N")){
                System.out.println("Exitting program! :)");
                break;
            }
        }
        

        sc.close();
    }

    static void disConvTable(int start, int end, int inc, String method){
        if (start > end){
            System.out.println("Error input!!");
        }
        else{
            System.out.println("US$\t  S$");
            System.out.println("------------");

            if (method.equals("for")){
                for(int i = start; i <= end; i+= inc){
                    System.out.printf(i + "\t" + i*1.82 + "\n");
                }
            }
            else if (method.equals("while")){
                int i = start;
                while (i <= end){
                    System.out.printf(i + "\t" + i*1.82 + "\n");
                    i += inc;
                }
            }

            else if (method.equals("dowhile")){
                int i = start;
                do{
                    System.out.printf(i + "\t" + i*1.82 + "\n");
                    i += inc;
                } while (i <= end);
            }
        }
    }
}
