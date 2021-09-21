import java.util.Scanner;
import java.util.Random;


public class P1 {
    public static void main(String[] args)
    {
        
        int choice, dividend, divisor;
        int input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
            case 1: /* add mulTest() call */
                mulTest();
                break;
            case 2: /* add divide() call */
                System.out.printf("Enter the dividend: ");
                dividend = sc.nextInt();
                System.out.printf("Enter the divisor: ");
                divisor = sc.nextInt();

                System.out.printf("The quotient is %d.\n", divide(dividend, divisor));
                break;
            case 3: /* add modulus() call */
                System.out.printf("Enter the dividend: ");
                dividend = sc.nextInt();
                System.out.printf("Enter the divisor: ");
                divisor = sc.nextInt();

                System.out.printf("The remainder is %d.\n", modulus(dividend, divisor));
                break;
            case 4: /* add countDigits() call */
                System.out.printf("Enter a positive integer n: ");
                input = sc.nextInt();
                if (input > 0)
                    System.out.printf("n: %d - count = %d \n", input, countDigits(input));
                else
                    System.out.println("Error input!!");
                break;
            case 5: /* add position() call */
                System.out.printf("Enter a positive integer n: ");
                input = sc.nextInt();
                System.out.println("Enter digit to find: ");
                int digit = sc.nextInt();
                if (input > 0)
                    System.out.printf("position = %d\n", position(input, digit)); // Will return first occurance of "digit" from RTL
                else
                    System.out.println("Error input!!");
                break;
            case 6: /* add extractOddDigits() call */
                System.out.printf("Enter a positive integer n: ");
                long linput = sc.nextLong();
                if (linput > 0)
                    System.out.printf("oddDigits = %d\n", extractOddDigits(linput));
                else
                    System.out.println("Error input!!");

                break;
            case 7: 
                System.out.println("Program terminating ...");
                break;
            default:
                System.out.println("Invalid choice");
        }
        } while (choice < 7);

        sc.close();
    }
    /* add method code here */

    public static void mulTest(){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int rightAns = 0;
        //random.nextInt(max-min) + min;

        int left, right;

        for(int i = 1; i <= 5; i++){

            left = (int) (Math.random() * 10);
            right = (int) (Math.random() * 10);
            System.out.printf("How much is %d times %d? ", left, right);
            if (sc.nextInt() == (left * right)){
                rightAns++;
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect :(");
            }
        }

        System.out.printf("%d answers out of 5 is correct. \n", rightAns);
    }

    public static int divide(int m, int n){
        int quotient = 0;
        for (int i = 0; i < n; i++){
            if ((m - n) >= 0){
                m -= n;
                quotient++;
            }
        }
        return quotient;
    }

    public static int modulus(int m, int n){
        for (int i = 0; i < n; i++){
            if ((m - n) >= 0){
                m -= n;
            }
        }

        return m;
    }

    public static int countDigits(int n){
        int numDigits = 0;

        while (n >= 1){
            n /= 10;
            numDigits++;
        }

        return numDigits;
    }

    public static int position(int n, int digit){
        int right, counter = 0;

        do{
            right = n % 10;
            counter++;
            n /= 10;
            if (right == digit){
                return counter;
            }

        } while (n > 0);

        return -1;
    }

    public static long extractOddDigits(long n){
        int right, ans = 0, size = 1;
        while(n > 0){
            right = (int) (n % 10);
            n /= 10;
            if (right % 2 == 1){
                ans += size * right;
                size *= 10;
            }
        } 

        if (ans != 0){
            return ans;
        }
        else{
            return -1;
        }
    }
}