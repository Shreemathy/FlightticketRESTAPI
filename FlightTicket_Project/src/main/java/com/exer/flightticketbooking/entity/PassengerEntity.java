package com.exer.flightticketbooking.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class PassengerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int passengerId;
	private String passengerName;
	private int passengerAge;
	private String passengerGender;
	private String passengerMail;
	private long passengerContact;
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}
	public String getPassengerMail() {
		return passengerMail;
	}
	public void setPassengerMail(String passengerMail) {
		this.passengerMail = passengerMail;
	}
	public long getPassengerContact() {
		return passengerContact;
	}
	public void setPassengerContact(long passengerContact) {
		this.passengerContact = passengerContact;
	}
	public PassengerEntity(int passengerId, String passengerName, int passengerAge, String passengerGender,
			String passengerMail, long passengerContact) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
		this.passengerMail = passengerMail;
		this.passengerContact = passengerContact;
	}
	public PassengerEntity() {
		super();
	
	}
	
	
	
}
	
	
	


