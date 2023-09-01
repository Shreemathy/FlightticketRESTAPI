package com.exer.flightticketbooking.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exer.flightticketbooking.entity.PassengerEntity;
import com.exer.flightticketbooking.repository.PassengerRepository;


@Service


public class PassengerService {
	@Autowired
	PassengerRepository pd;
	public PassengerEntity add(PassengerEntity p) {
		  return pd.save(p);
	}
	public List<PassengerEntity> print(PassengerEntity p){
		  return pd.findAll();
	}
	public PassengerEntity update(PassengerEntity p){
		  return pd.saveAndFlush(p);
	}
	public void delete(int id) {
		  pd.deleteById(id);
	}
	public void deleteinfo(PassengerEntity p) {
		  pd.delete(p);
	}
	
}

