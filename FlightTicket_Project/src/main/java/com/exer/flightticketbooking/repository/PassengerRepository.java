package com.exer.flightticketbooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exer.flightticketbooking.entity.PassengerEntity;


@Repository
public interface PassengerRepository extends JpaRepository<PassengerEntity,Integer>{

}
