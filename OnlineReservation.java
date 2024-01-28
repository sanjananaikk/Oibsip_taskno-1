import java.util.Scanner;
public class OnlineReservation {
    private  static boolean[] seats = new boolean[20];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( true ){
            System.out.println("\nPlease select an option:");
            System.out.println("1.View seat Map");
            System.out.println("2.Reserve Seat");
            System.out.println("3.Cancel Reservation");
            System.out.println("4.Exit");



            int option = scanner.nextInt();
            switch (option){
                case 1:
                    viewSeatMap();
                    break;

                case 2:
                    reserveSeat();
                    break;
                    
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.out.println("Thank you!");


            }
        }
    }

    private static void viewSeatMap(){
        System.out.println("\nCurrent Seat Map:");
        for(int i=0; i< seats.length; i++){
            if (seats[i]){
                System.out.println("X");  // print X which the seat is reserved
            }else{
                System.out.println((i+1)+ " "); //print the seat number if it is empty
            }
        }
        System.out.println();
    }

    public static void reserveSeat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter seat number (1-20):");
        int seatNumber = scanner.nextInt();
        if (seatNumber<1|| seatNumber>20){
            System.out.println("Inalid seat number");
        } else if(seats[seatNumber-1]){
            System.out.println("Seat already reserved");
        } else{
            seats[seatNumber-1]=true; //reserve the seat
            System.out.println("Seat reserved");

        }
    }

    private static void cancelReservation(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("\nEnter seat number(1-10): ");
        int seatNumber =scanner.nextInt();
        if (seatNumber < 1 || seatNumber>20){
            System.out.println("Invalid seat number!");
        }else if (!seats[seatNumber - 1]){
            System.out.println("Seats not reserved!");
        }else{
            seats[seatNumber -1]= false;  //unreserve the seat
            System.out.println("Reservation cancelled!");
        }
    }

    
}