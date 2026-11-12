package src.parkinglot.controllers;

import src.parkinglot.dtos.GenerateTicketRequestDto;
import src.parkinglot.dtos.GenerateTicketResponseDto;
import src.parkinglot.models.Gate;
import src.parkinglot.models.Ticket;
import src.parkinglot.models.Vehicle;
import src.parkinglot.models.VehicleType;
import src.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
//    public void generateTicket(Vehicle vehicle, Gate gate){
//
//
//    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto request) {
        String vehicleNumber = request.getVehicleNumber();
        VehicleType vehicleType = request.getVehicleType();
        Long gateId = request.getGateId();

        Ticket ticket = new Ticket();
        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();

        try{
            ticket = ticketService.ge
        }
        return null;
    }
}
