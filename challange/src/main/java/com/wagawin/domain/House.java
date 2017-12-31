package com.wagawin.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class House {
	
	@Id
	@GeneratedValue
	private Long id;
	private String address;
	private String zipCode;
	private HouseType houseType;

	@OneToOne
	private Person person;
	
	@SuppressWarnings("unused")
	private House(){}
	
	public House(String address, String zipCode){
		this.setAddress(address);
		this.setZipCode(zipCode);
	}

	public House(String address, String zipCode, HouseType houseType){
		this.setAddress(address);
		this.setZipCode(zipCode);
		this.setHouseType(houseType);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public HouseType getHouseType() {
		return houseType;
	}

	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "House [address=" + address + ", zipCode=" + zipCode + ", houseTpye=" + houseType +"]";
	}
	
	
}