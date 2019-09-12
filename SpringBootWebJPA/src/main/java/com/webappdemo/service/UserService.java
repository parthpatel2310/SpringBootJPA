package com.webappdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.webappdemo.DAO.CustomerDAO;
import com.webappdemo.controller.UserAuthenticationController;
import com.webappdemo.model.Customer;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private CustomerDAO CDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Customer customerDetail = CDAO.findCustomerByCustomerName(username);
		
		if(customerDetail == null)
		{
			throw new UsernameNotFoundException("Invalid Username");
		}
		
		return new UserAuthenticationController(customerDetail);
	}

}
