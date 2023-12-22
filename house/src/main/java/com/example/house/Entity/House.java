package com.example.house.Entity;


import com.example.house.Model.Address;
import com.example.house.Model.FamilyMembers;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "house_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class House {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer noOfMembers;
    
    @Embedded
    private Address address;
    
    @Embedded
    private FamilyMembers members;
}
