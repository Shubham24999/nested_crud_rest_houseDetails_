package com.example.house.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.house.Entity.House;
import com.example.house.Repository.HouseRepository;

@Service
public class HouseService {
    
    @Autowired
    HouseRepository houseRepository;

    public House setHouseDetail(House data){

        return houseRepository.save(data);
    }


    
}
