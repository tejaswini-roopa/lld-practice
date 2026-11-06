package src.parkinglot.models;

import java.util.List;

public class ParkingSpot extends BaseModel {
    private int number;
    private List<VehicleType> supportedVechicles;
    private SpotStatus spotStatus;
    private Vehicle vehicle;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<VehicleType> getSupportedVechicles() {
        return supportedVechicles;
    }

    public void setSupportedVechicles(List<VehicleType> supportedVechicles) {
        this.supportedVechicles = supportedVechicles;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
