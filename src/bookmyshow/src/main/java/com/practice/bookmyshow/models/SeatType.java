package com.practice.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class SeatType extends BaseModel{
    private String name;
}
