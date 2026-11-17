package src.parkinglot;

import src.parkinglot.controllers.TicketController;
import src.parkinglot.repositories.GateRepository;
import src.parkinglot.repositories.ParkingLotRepository;
import src.parkinglot.repositories.TicketRepository;
import src.parkinglot.repositories.VehicleRepository;
import src.parkinglot.services.TicketService;
import src.parkinglot.strategies.spotassignmentstrategy.RandomSpotAssignmentStrategy;
import src.parkinglot.strategies.spotassignmentstrategy.SpotAssignmentStrategy;

public class ParkingLotApplication {
    void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        SpotAssignmentStrategy spotAssignmentStrategy = new RandomSpotAssignmentStrategy();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                spotAssignmentStrategy,
                ticketRepository,
                parkingLotRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        System.out.println("Application has started on part :8080");
    }
}
