package com.practice.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String name;
    private int age;
    private String email;
    private String password;
    private String phoneNumber;
}
