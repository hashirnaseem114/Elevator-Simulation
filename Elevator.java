import java.util.Arrays;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        int currentFloor = 0;
        int[] totalFloors = {0, 1, 2, 3, 4, 5};
        int totalFloorRequests = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please input total number of floor requests: ");
        totalFloorRequests = input.nextInt();
        System.out.println("");

        while (totalFloorRequests > 5 || totalFloorRequests <= 0) {
            System.out.println("Please enter a valid total number of floor requests (1-5): ");
            totalFloorRequests = input.nextInt();
        }
        
        for (int i=1; i <= totalFloorRequests; i++) {
            System.out.println("Enter Request " + i + ": ");
            int requestedFloor = input.nextInt();
            System.out.println("");

            if (requestedFloor == currentFloor) {
                System.out.println("Doors Opening");
                System.out.println("Current Floor: " + currentFloor);
                System.out.println("");
            } 
            
            else if (requestedFloor > currentFloor && requestedFloor < 6 && requestedFloor >= 0) {
                System.out.println("Moving Up");
                System.out.println("Reached floor: " + requestedFloor);
                System.out.println("Doors Opening");
                currentFloor = requestedFloor;
                System.out.println("Current Floor: " + currentFloor);
                System.out.println("");
            } 
            
            else if (requestedFloor < currentFloor && requestedFloor < 6 && requestedFloor >= 0) {
                System.out.println("Moving Down");
                System.out.println("Reached floor: " + requestedFloor);
                System.out.println("Doors Opening");
                currentFloor = requestedFloor;
                System.out.println("Current Floor: " + currentFloor);
                System.out.println("");
            } 
            
            else {
                System.out.println("\nPlease choose a valid floor from: " + Arrays.toString(totalFloors));
                System.out.println("Current Floor: " + currentFloor);
                System.out.println("");
                i--;
                continue;
            }
        }
        
    }
}