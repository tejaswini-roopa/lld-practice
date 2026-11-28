package com.practice.bookmyshow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Movie extends BaseModel{

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Language> languages;
}
