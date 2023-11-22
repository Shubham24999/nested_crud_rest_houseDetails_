package com.example.house.Model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class FamilyMembers {

    private String nameOfFamilyHead;

    private Integer ageOfFamilyHead;

}
