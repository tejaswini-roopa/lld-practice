package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Theatre extends BaseModel{
    private String name;
    private String address;
    private List<Auditorium> auditoriums;
    private City city;
}
