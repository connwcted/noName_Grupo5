package Grupo5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingManager manager = new ParkingManager();
        int option;

        do {
            System.out.println("1. Park Car");
            System.out.println("2. Show Available Spots");
            System.out.println("3. List Records");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Student Name: ");
                    String student = scanner.next();
                    System.out.print("Car License Plate: ");
                    String licensePlate = scanner.next();
                    System.out.print("Parking Time (in seconds): ");
                    long parkingTime = scanner.nextLong();

                    if (manager.park(student, licensePlate, parkingTime)) {
                        System.out.println("Car parked successfully!");
                    } else {
                        System.out.println("Parking lot full! Please try again later.");
                    }
                    break;

                case 2:
                    manager.showAvailableSpots();
                    break;

                case 3:
                    manager.listRecords();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 0);

        scanner.close();
    }
}
