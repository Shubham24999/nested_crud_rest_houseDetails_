package com.example.house.Service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.house.Entity.House;
import com.example.house.Repository.HouseRepository;

@Service
public class HouseService {

    private static final Logger logger = LogManager.getLogger(HouseService.class);
    
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

    public House updateHouseDetail(Integer id, House updatedHouseData) {
        House existingHouse = houseRepository.findById(id).orElse(null);
        if (existingHouse != null) {
            // Update the existing house entity with the new data
            existingHouse.setNoOfMembers(updatedHouseData.getNoOfMembers());
            existingHouse.setAddress(updatedHouseData.getAddress());
            existingHouse.setMembers(updatedHouseData.getMembers());

            // Save the updated house entity to the database
            return houseRepository.save(existingHouse);
        }
        return null; // Handle if the house with the given id doesn't exist
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
            logger.info(e.getMessage());
            return "Some error Occurs.";
         }
        

    }

    
}
