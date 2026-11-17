package src.parkinglot.controllers;

import src.parkinglot.dtos.GenerateTicketRequestDto;
import src.parkinglot.dtos.GenerateTicketResponseDto;
import src.parkinglot.exceptions.InvalidGateException;
import src.parkinglot.exceptions.NoAvailableSpotException;
import src.parkinglot.models.Gate;
import src.parkinglot.models.Ticket;
import src.parkinglot.models.Vehicle;
import src.parkinglot.models.VehicleType;
import src.parkinglot.services.TicketService;
import src.parkinglot.dtos.ResponseStatus;

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
        GenerateTicketResponseDto response = new GenerateTicketResponseDto();

        try{
            ticket = ticketService.generateTicket(
                    gateId,vehicleType,vehicleNumber
            );
        }catch (InvalidGateException e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage("Gate ID is invalid");
            return response;
        } catch (NoAvailableSpotException e) {
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setMessage("No parking spot available");
            return response;
        }

        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTicketId(ticket.getId());
        response.setOperatorName(ticket.getOperator().getName());
        response.setSpotNumber(ticket.getParkingSpot().getNumber());

        return response;
    }
}
