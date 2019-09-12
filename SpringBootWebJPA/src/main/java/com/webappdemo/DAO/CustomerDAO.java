package com.webappdemo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webappdemo.model.Customer;

public interface CustomerDAO extends JpaRepository<Customer,Integer>{
	
	
	@Query("from Customer where cityid=?1")
	List<Customer> findCustomerByCustomerCity(int cityId);
	
	
	Customer findCustomerByCustomerName(String customerName);
	
	

}
