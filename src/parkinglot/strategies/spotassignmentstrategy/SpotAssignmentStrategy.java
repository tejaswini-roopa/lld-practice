package src.parkinglot.strategies.spotassignmentstrategy;

import src.parkinglot.models.Gate;
import src.parkinglot.models.ParkingLot;
import src.parkinglot.models.ParkingSpot;
import src.parkinglot.models.VehicleType;

import java.util.Optional;

public interface SpotAssignmentStrategy {
    Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate);
}
