package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Auditorium extends BaseModel{
    private String name;
    private List<Show> shows;
    private List<Feature> features;
}
