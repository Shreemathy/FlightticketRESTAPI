package com.exer.flightticketbooking.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.exer.flightticketbooking.entity.FlightEntity;

import jakarta.transaction.Transactional;




@Repository
public interface FlightRepository extends JpaRepository<FlightEntity,Integer>{
	  //List<FlightEntity> findByFlightdestination(String destination);
	//jpql
	
	@Query("select f from FlightEntity f")
	public List<FlightEntity>getAllFlightsUsingJPQL();
	@Modifying
    @Transactional
    @Query(value="update flight_entity set flighttype=?1 where flightid=?2",nativeQuery = true)
    public int updateinfo(String newtype,int oldid);

}
