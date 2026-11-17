package src.parkinglot.services;

import src.parkinglot.exceptions.InvalidGateException;
import src.parkinglot.exceptions.NoAvailableSpotException;
import src.parkinglot.models.*;
import src.parkinglot.repositories.IGateRepository;
import src.parkinglot.repositories.ParkingLotRepository;
import src.parkinglot.repositories.TicketRepository;
import src.parkinglot.repositories.VehicleRepository;
import src.parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private IGateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private TicketRepository  ticketRepository;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(IGateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         SpotAssignmentStrategy spotAssignmentStrategy,
                         TicketRepository ticketRepository,
                         ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;

    }
    public Ticket generateTicket(
            Long gateId, VehicleType vehicleType, String vehicleNumber
    ) throws InvalidGateException, NoAvailableSpotException {
        /*
        Gate = get gate for that id from db. Else throw an exception
        Operator = from gate
        Vehicle = check if already in DB. If yes, get that. Else, create
        ParkingSpot = strategy
        Ticket ticket =
         */

        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);

        if (gateOptional.isEmpty()) {
            throw new InvalidGateException();
        }

        Gate gate = gateOptional.get();

        Operator operator = gate.getCurrentOperator();

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle vehicle;

        if (vehicleOptional.isEmpty()) {
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle = vehicleRepository.save(vehicle);
        } else {
            vehicle = vehicleOptional.get();
        }

        Optional<ParkingLot> parkingLot = parkingLotRepository.findParkingLotByGate(
                gate
        );

        if (parkingLot.isEmpty()) {
            throw new RuntimeException();
        }

        Optional<ParkingSpot> parkingSpotOptional = spotAssignmentStrategy.findSpot(
                vehicleType, parkingLot.get(), gate
        );

        if (parkingSpotOptional.isEmpty()) {
            throw new NoAvailableSpotException();
        }

        ParkingSpot parkingSpot = parkingSpotOptional.get();

        Ticket ticket = new Ticket();
        ticket.setParkingSpot(parkingSpot);
        ticket.setGate(gate);
        ticket.setEntryTime(new Date());
        ticket.setVehicle(vehicle);
        ticket.setOperator(operator);

        return ticketRepository.save(ticket);
    }
}
