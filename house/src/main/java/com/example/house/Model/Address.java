package com.example.house.Model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Address {

    private Integer houseNumber;

    private String streetName;
    
    private String landMark;

    private String houseName;
    
}
