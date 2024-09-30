package Grupo5;

public class Record {
    private String student;
    private Car car;
    private long parkingTime; // in seconds
    private double amountPaid;

    public Record(String student, Car car, long parkingTime) {
        this.student = student;
        this.car = car;
        this.parkingTime = parkingTime;
        this.amountPaid = calculateAmount(parkingTime);
    }

    private double calculateAmount(long time) {
        return (time / 900) * 0.10; // 15 minutes = 900 seconds
    }

    public String getStudent() {
        return student;
    }

    public Car getCar() {
        return car;
    }

    public long getParkingTime() {
        return parkingTime;
    }

    public double getAmountPaid() {
        return amountPaid;
    }
}
