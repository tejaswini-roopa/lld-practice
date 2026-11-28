package com.practice.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity(name = "shows")
public class Show extends BaseModel{
    @ManyToOne
    private Auditorium auditorium;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private Movie movie;
    @Enumerated(EnumType.ORDINAL)
    private Language language;
}
