package models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Show extends BaseModel{
    private Auditorium auditorium;
    private Date startTime;
    private Date endTime;
    private Movie movie;
    private Language language;
}
