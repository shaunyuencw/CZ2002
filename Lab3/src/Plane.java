public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat;

    private static final int PLANESIZE = 12;

    public Plane(){
        // ? Assume every plane has 12 seats
        seat = new PlaneSeat[PLANESIZE];
        for (int i = 0; i < PLANESIZE; i++){
            seat[i] = new PlaneSeat(i+1);
        }
        numEmptySeat = PLANESIZE;
    }

    private PlaneSeat[] sortSeats(){
        // * Basic BubbleSort...
        PlaneSeat[] seatClone = seat.clone();
        for (int i = seatClone.length - 1; i >= 0; i--){
            if (seatClone[i].isOccupied()){ // Seat i is occupied.
                for (int j = 0; j <= i; j++){
                    if (seatClone[j].isOccupied()){ // Seat j is occupied.
                        // Move occupied seat with smaller customerid to left
                        if (seatClone[j].getCustomerId() > seatClone[i].getCustomerId()){
                            PlaneSeat temp = seatClone[j];
                            seatClone[j] = seatClone[i];
                            seatClone[i] = temp;
                        }
                    }
                }
            }
        }
        return seatClone;
    }

    public void showNumEmptySeats(){
        System.out.printf("There are %d empty seats.\n", numEmptySeat);
    }

    public void showEmptySeats(){
        // Show which seats are empty
        System.out.printf("The following seats are empty: \n");
        for (int i = 0; i < PLANESIZE; i++){
            if (!seat[i].isOccupied()){
                System.out.printf("SeatID %d\n", seat[i].getSeatId());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId){
        if (bySeatId){
            System.out.printf("The seat assignments are as follow: \n");
            for (int i = 0; i < PLANESIZE; i++){
                if (seat[i].isOccupied() == true){
                    System.out.printf("Seat %d assigned to CustomerID %d\n", seat[i].getSeatId(), seat[i].getCustomerId());
                }
            }
        }   
        else{
            PlaneSeat[] sortedSeats = sortSeats();
            for (int i = 0; i < PLANESIZE; i++){
                if (seat[i].isOccupied() == true){
                    System.out.printf("Seat %d assigned to CustomerID %d\n", sortedSeats[i].getSeatId(), sortedSeats[i].getCustomerId());
                }
            }
        }
    }

    public void assignSeat(int seatId, int cust_id){
        // ! Boundary Case
        if(seatId < 0 || seatId > 12){
            System.out.println("Invalid seat ID");
            return;
        }   

        if (!seat[seatId - 1].isOccupied()){
            seat[seatId - 1].assign(cust_id);
            numEmptySeat--;
            System.out.println("Seat Assigned!");
        }
        else{
            System.out.println("Seat already assigned to a customer.");
        }
    }

    public void unAssignSeat(int seatId){
        // ! Boundary Case
        if(seatId < 0 || seatId > 12){
            System.out.println("Invalid seat ID");
            return;
        } 
        
        if (seat[seatId - 1].isOccupied()){ 
            seat[seatId - 1].unAssign();
            numEmptySeat++;
            System.out.println("Seat Unassigned!");
        }
        else{
            System.out.println("No customer assigned to this seat.");
        }
    }
}
