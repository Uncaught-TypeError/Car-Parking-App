package Assignment;

import java.util.*;

public class GatePass extends Car {

    public static void main(String[] args) {
        GatePass CP = new GatePass();
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Welcome to the Parking:");
            System.out.println("1: To Park Vehicle");
            System.out.println("2: To Departure");
            System.out.println("3: Show Vehicles in the Parking");
            System.out.println("0: To Exit");

            System.out.print("Enter your choice:");
            menu = input.nextInt();
            System.out.println();

            switch (menu) {
                case 1: {
                    String VehicleType;
                    System.out.println("Please choose vehicle type:");
                    System.out.println("C = Car");
                    System.out.println("M = MotorCycle");
                    System.out.println("T = Truck");
                    VehicleType = input.next();
                    if (VehicleType.equals("C")) {
                        System.out.println("Enter Vehicle Number:");
                        String carnum = input.next();
                        System.out.println("Enter Model:");
                        String brand = input.next();
                        System.out.println("Enter Brand:");
                        int model = input.nextInt();
                        System.out.println("Enter Passenger Number:");
                        int Passenger = input.nextInt();
                    } else if (VehicleType.equals("M")) {
                        System.out.println("Enter Vehicle Number:");
                        String carnum = input.next();
                        System.out.println("Enter Model:");
                        String brand = input.next();
                        System.out.println("Enter Brand:");
                        int model = input.nextInt();
                        System.out.println("Enter Passenger Number:");
                        int Passenger = input.nextInt();
                    } else if (VehicleType.equals("T")) {
                        System.out.println("Enter Vehicle Number:");
                        String carnum = input.next();
                        System.out.println("Enter Model:");
                        String brand = input.next();
                        System.out.println("Enter Brand:");
                        int model = input.nextInt();
                        System.out.println("Enter Passenger Number:");
                        int Passenger = input.nextInt();
                    }
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    System.out.println("List of all Parked Vehicles: ");
                    CP.printParkedVehicleDetails();
                    break;
                }
                case 0: {
                    System.out.println("\nThank You!\n");
                    break;
                }
                default: {
                    System.out.println("Invalid Option!\n");
                    break;
                }
            }

        } while (menu != 0);

    }

    private void printParkedVehicleDetails() {

    }
}
