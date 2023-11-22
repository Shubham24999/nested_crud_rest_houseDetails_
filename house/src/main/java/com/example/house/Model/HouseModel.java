package com.example.house.Model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HouseModel {
    
    @Id
    private Integer id;

    private Integer noOfMembers;

    private Address address;

    
    
}
