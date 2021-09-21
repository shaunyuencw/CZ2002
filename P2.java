import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary, merit;
        char grade = ' ';
        while(true){
            System.out.printf("Salary: ");
            salary = sc.nextInt();
            System.out.printf("Merit: ");
            merit = sc.nextInt();

            if (salary >= 500 && salary <= 649){
                if (salary >= 600 && merit >= 10){
                    grade = 'B';
                }
                else{
                    grade = 'C';
                }
            }
            else if (salary >= 600 && salary <= 799){
                if (salary >= 700 && merit >= 20){
                    grade = 'A';
                }
                else{
                    grade = 'B';
                }
            }
            else if (salary >= 700 && salary <= 899){
                grade = 'A';
            }
            
            if(grade == ' '){
                System.out.println("Grade cannot be determined");
            }
            else{
                System.out.println("Grade " + grade);
            }

            System.out.println("Continue? (Y/N)");
            if(sc.next().charAt(0) == 'N'){
                System.out.println("Exitting Program! :)");
                break;
            }
        }
        sc.close();
    }
}
