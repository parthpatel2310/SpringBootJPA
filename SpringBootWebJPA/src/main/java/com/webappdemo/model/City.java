package com.webappdemo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	
	
	@Id
	@Column(name="cityid")
	private int cityId;
	
	@Column(name="cityname")
	private String cityName;
	

	
		
	public int getCityId() {
		return cityId;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + "]";
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}
  
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	

	public void Display()
	{
		System.out.println("Hello");
	}

}
