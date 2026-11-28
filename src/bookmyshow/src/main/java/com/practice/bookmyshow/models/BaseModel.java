package com.practice.bookmyshow.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Setter
@Getter
@MappedSuperclass
public class BaseModel {

    @Id
    private long id;

    private Date createdDate;
    private Date lastModifiedDate;
}
