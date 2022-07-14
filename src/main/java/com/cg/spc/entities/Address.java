package com.cg.spc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Address_table")
public class Address {
	
	
	@Id
	@GeneratedValue(generator="address_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="address_sql", sequenceName="address_id_seq",allocationSize=1)
	private int addressId;
	@Column(length=30)
	private String buildingName;
	@Column(length=30)
	private String streetName;
	@Column(length=30)
	private String cityName;
	@Column(length=30)
	private String pincode;
	
	
	
	
	public Address(String buildingName, String streetName, String cityName, String pincode) {
		super();
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pincode = pincode;
	}
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
