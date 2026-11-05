package src.parkinglot.models;

import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> parkingSpots;
    private int floor;

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
