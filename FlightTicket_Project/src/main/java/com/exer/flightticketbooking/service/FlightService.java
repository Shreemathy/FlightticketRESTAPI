package com.exer.flightticketbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exer.flightticketbooking.entity.FlightEntity;
import com.exer.flightticketbooking.repository.FlightRepository;

@Service

public class FlightService {
	@Autowired
	private FlightRepository flightRepository;
	
	
	

	public FlightEntity saveFlights(FlightEntity f) {
		return flightRepository.save(f);
	}
	
	//Pagination and Sorting
	
	public Page<FlightEntity> getFlightsByField(String field,int pageNo,int pageSize){
		Sort sort=Sort.by(field);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		return flightRepository.findAll(pageable);
	}
	
	
	
	//CRUD operation
	public FlightEntity getFlight(int FlightId) {
		Optional<FlightEntity> optional=flightRepository.findById(FlightId);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}

//	public int addFlight(FlightEntity f){
//		FlightEntity save=flightRepository.save(f);
//		return save.getFlightid();
//		}
	
	public List<FlightEntity> getAllFlights(){
		return flightRepository.findAll();
	}
	
	public void updateFlight(FlightEntity f) {
		flightRepository.save(f);
		
	}
	
	public void deleteFlight(int flightId) {
		Optional<FlightEntity> optional = flightRepository.findById(flightId);
		if(!optional.isEmpty()) {
		  flightRepository.delete(optional.get());
		}
	}

	


	public void deleteById(int id)
	{
		Optional<FlightEntity>optional=flightRepository.findById(id);
		if(!optional.isEmpty())
		{
			flightRepository.delete(optional.get());
		}
	}
	//jpql
public List<FlightEntity> getAllFlightsUsingJPQL(){
		return flightRepository.getAllFlightsUsingJPQL();
	}
    public String upadteinfo(String type,int id1) {
    	flightRepository.updateinfo(type,id1);
    	return "updated";
    }

	
}