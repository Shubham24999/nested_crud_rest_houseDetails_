package com.example.house.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<House> getSingleDetail(Integer id){
        return houseRepository.findById(id);
    }

    public List<House> getHouseDetails(){
        return (List<House>) houseRepository.findAll();
    }

    public String deleteSingleHouseDetail(Integer id){

         try {
           Optional <House> data= houseRepository.findById(id);
        if(data.isPresent()){
           houseRepository.delete(data.get());
           return "Data has been Deleted.";
         }else{
            return "Data with Id not Present";
         }
         } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Some error Occurs.";
         }
        

    }


    
}
