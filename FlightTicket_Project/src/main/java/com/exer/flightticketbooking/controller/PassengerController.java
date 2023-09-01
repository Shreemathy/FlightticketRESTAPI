package com.exer.flightticketbooking.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exer.flightticketbooking.entity.PassengerEntity;
import com.exer.flightticketbooking.service.PassengerService;

  

@RestController
public class PassengerController {
	@Autowired
    PassengerService pd;
    
    @PostMapping("addp")
    public PassengerEntity addf(@RequestBody PassengerEntity p) {
    	return pd.add(p);
    }
    @GetMapping("disp")
    public List<PassengerEntity>show(@RequestBody PassengerEntity p){
    	return pd.print(p);
    }
    @PutMapping("updatep")
    public PassengerEntity update (@RequestBody PassengerEntity p) {
    	return pd.update(p);
    }
    @DeleteMapping("delp/{id}")
    public String del(@PathVariable int id) {
    	pd.delete(id);
    	return "Deleted";
    }

}


