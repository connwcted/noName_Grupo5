package Grupo5;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static final int MAX_CAPACITY = 500;
    private List<Record> records;

    public ParkingLot() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(Record record) {
        if (records.size() < MAX_CAPACITY) {
            records.add(record);
            return true;
        }
        return false; // Lot full
    }

    public List<Record> getRecords() {
        return records;
    }

    public int getAvailableSpots() {
        return MAX_CAPACITY - records.size();
    }
}
