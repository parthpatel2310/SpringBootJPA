package com.webappdemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webappdemo.model.Customer;

public interface CustomerDAO extends JpaRepository<Customer,Integer>{

}
