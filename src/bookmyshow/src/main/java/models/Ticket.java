package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Ticket extends BaseModel{
    private int amount;
    private Date timeOfBooking;
    private Show show;
    private List<Seat> seats;
    private User bookedBy;
    private List<Payment> payments;
    private TicketStatus status;
}
