package com.practice.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Auditorium extends BaseModel{
    private String name;

    @OneToMany
    private List<Seat> seats;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;
}
