package Grupo5;

import java.util.List;

public class ParkingManager {
    private ParkingLot parkingLot;

    public ParkingManager() {
        this.parkingLot = new ParkingLot();
    }

    public boolean park(String student, String licensePlate, long parkingTime) {
        Car car = new Car(licensePlate);
        Record record = new Record(student, car, parkingTime);
        return parkingLot.addRecord(record);
    }

    public void showAvailableSpots() {
        System.out.println("Available spots: " + parkingLot.getAvailableSpots());
    }

    public void listRecords() {
        List<Record> records = parkingLot.getRecords();
        for (Record record : records) {
            System.out.println("Student: " + record.getStudent() +
                    ", License Plate: " + record.getCar().getLicensePlate() +
                    ", Time: " + record.getParkingTime() +
                    "s, Amount Paid: " + record.getAmountPaid() + "€");
        }
    }
}
