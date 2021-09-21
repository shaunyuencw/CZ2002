import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Plane myPlane = new Plane();
        Scanner sc = new Scanner(System.in);
        boolean cont = true; int choice;
        int seatID, custID;

        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println("(4) Show the list of seat assigments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit\n");

        do{
            System.out.print("Enter the number of your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    // Show number of empty seats
                    myPlane.showNumEmptySeats();
                    break;
                case 2:
                    // Show the list of empty seats
                    myPlane.showEmptySeats();
                    break;
                case 3:
                    // Show the list of seat assignments by seatID
                    myPlane.showAssignedSeats(true);
                    break;
                case 4:
                    myPlane.showAssignedSeats(false);
                    break;
                case 5:
                    // Assign a customer to a seat
                    System.out.println("Assigning Seat...");
                    System.out.printf("Please enter SeatID: ");
                    seatID = sc.nextInt();
                    System.out.printf("Please enter Customer ID: ");
                    custID = sc.nextInt();

                    myPlane.assignSeat(seatID, custID);
                    
                    break;
                case 6:
                    // Remove a seat assignment
                    System.out.printf("Enter SeatID to unassign customer from: ");
                    seatID = sc.nextInt();
                    myPlane.unAssignSeat(seatID);
                    break;
                case 7:
                    System.out.println("Terminating program...");
                    cont = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        } while (cont);

        sc.close();
    }
}
