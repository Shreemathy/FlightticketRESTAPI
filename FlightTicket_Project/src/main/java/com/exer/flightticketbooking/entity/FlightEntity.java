package com.exer.flightticketbooking.entity;
import java.util.Set;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;



@Entity
public class FlightEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	  private int Flightid;
	   private String flighttype;
	   private String boarding;
	   private String flightdestination;
	   private String flightdate;
	   private int Seats;
	  
//	   
//	   //onetoone
//	   @OneToOne(cascade=CascadeType.ALL)
//	   @JoinColumn(name="shree")
//	   private PassengerEntity passenger;
	   
	   //onetomany
	   @OneToMany(cascade=CascadeType.ALL)
	   @JoinColumn(name="fk_id")
	   @Fetch(FetchMode.JOIN)
	   private Set<PassengerEntity> passenger;

	public int getFlightid() {
		return Flightid;
	}

	public void setFlightid(int flightid) {
		Flightid = flightid;
	}

	public String getFlighttype() {
		return flighttype;
	}

	public void setFlighttype(String flighttype) {
		this.flighttype = flighttype;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getFlightdestination() {
		return flightdestination;
	}

	public void setFlightdestination(String flightdestination) {
		this.flightdestination = flightdestination;
	}

	public String getFlightdate() {
		return flightdate;
	}

	public void setFlightdate(String flightdate) {
		this.flightdate = flightdate;
	}

	public int getSeats() {
		return Seats;
	}

	public void setSeats(int seats) {
		Seats = seats;
	}

	public Set<PassengerEntity> getPassenger() {
		return passenger;
	}

	public void setPassenger(Set<PassengerEntity> passenger) {
		this.passenger = passenger;
	}

	public FlightEntity(int flightid, String flighttype, String boarding, String flightdestination, String flightdate,
			int seats, Set<PassengerEntity> passenger) {
		super();
		Flightid = flightid;
		this.flighttype = flighttype;
		this.boarding = boarding;
		this.flightdestination = flightdestination;
		this.flightdate = flightdate;
		Seats = seats;
		this.passenger = passenger;
	}

	public FlightEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
	
	   




