package com.webappdemo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.webappdemo.model.City;

public interface CityDAO extends CrudRepository<City, Integer> {

}
