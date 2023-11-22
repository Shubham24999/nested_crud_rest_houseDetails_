package com.example.house.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    
    
    @PostMapping("/detail/create")
    public House setDetail(@RequestBody House data){

        return houseService.setHouseDetail(data);
    }
    
}
