package com.practice.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Ticket extends BaseModel{
    private int amount;
    private Date timeOfBooking;

    @ManyToOne
    private Show show;

    @ManyToMany
    private List<Seat> seats;

    @ManyToOne
    private User bookedBy;

    @OneToMany(mappedBy = "ticket")
    private List<Payment> payments;

    @Enumerated(EnumType.ORDINAL)
    private TicketStatus status;
}
