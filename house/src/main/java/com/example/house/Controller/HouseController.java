package com.example.house.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.house.Entity.House;
import com.example.house.Service.HouseService;

@RestController
@ResponseBody
public class HouseController {
    
    @Autowired
    HouseService houseService;
    
    @GetMapping("/housedetails")
    public List<House> getDetails(){

        return (List<House>) houseService.getHouseDetails();
    }
    
    @GetMapping("/housedetail/{id}")
    public Optional<House> getDetail(@PathVariable Integer id){
        return houseService.getSingleDetail(id);
    }
    
    
    @PostMapping("/detail/create")
    public House setDetail(@RequestBody House data){

        return houseService.setHouseDetail(data);
    }
    

    @DeleteMapping("/housedetail/{id}")
    public String deleteDetail(@PathVariable Integer id){
       return houseService.deleteSingleHouseDetail(id);
    }


    

}
