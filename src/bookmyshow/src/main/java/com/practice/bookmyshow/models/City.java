package com.practice.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class City extends BaseModel{

    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres;
    private String name;
}
