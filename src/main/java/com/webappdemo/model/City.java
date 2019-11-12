package com.webappdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cityid")
    private int cityId;

    @Column(name = "cityname")
    private String cityName;


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "City [cityId=" + cityId + ", cityName=" + cityName + "]";
    }

    public String getCityName() {
        return cityName;
    }


    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public void Display() {
        System.out.println("Hello");
    }

}
