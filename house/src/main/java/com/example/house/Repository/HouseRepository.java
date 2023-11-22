package com.example.house.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.house.Entity.House;

@Repository
public interface HouseRepository extends CrudRepository<House,Integer> {
    
}
