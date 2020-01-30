package com.webappdemo.DAO;

import com.webappdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer, Integer> {


    @Query("from Customer where cityid=:cityId")
    List<Customer> findCustomerByCustomerCity(@Param("cityId") int cityId);


    Customer findCustomerByCustomerName(String customerName);


}
