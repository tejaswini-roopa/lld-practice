package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class City extends BaseModel{
    private List<Theatre> theatres;
    private String name;
}
