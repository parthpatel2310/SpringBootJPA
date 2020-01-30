package com.webappdemo.controller;

import com.webappdemo.DAO.CityDAO;
import com.webappdemo.DAO.CustomerDAO;
import com.webappdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.webappdemo.model.City;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerDAO cDAO;

    @Autowired
    private CityDAO cityDAO;


    @RequestMapping("Customer")
    public ModelAndView viewCustomer() {
        ModelAndView mv = new ModelAndView("Customer");
        List<Customer> customerList = cDAO.findAll();

        List<Customer> customerListByCity = cDAO.findCustomerByCustomerCity(1);
      //  System.out.println(customerListByCity);
        mv.addObject(customerList);
        return mv;
    }

    @RequestMapping("addCustomer")
    public ModelAndView addCustomer() {
        ModelAndView mv = new ModelAndView("insertCustomer");
        List<City> cityList = (List<City>) cityDAO.findAll();
        mv.addObject(cityList);
        return mv;
    }

    @RequestMapping("saveCustomer")
    public String saveCustomer(Customer cust) {

        cDAO.save(cust);
        return "redirect:/Customer";
    }

    @RequestMapping("editCustomer/{id}")
    public ModelAndView editCustomer(@PathVariable int id) {
        ModelAndView mv = new ModelAndView("/editCustomer");
        Customer customer = cDAO.findById(id).orElse(new Customer());
        List<City> cityList = (List<City>) cityDAO.findAll();
        mv.addObject(cityList);
        System.out.println(customer);
        mv.addObject("cust", customer);
        return mv;
    }

    @RequestMapping("deleteCustomer")
    public String deleteCustomer(@RequestParam int id) {
        cDAO.deleteById(id);
        return "redirect:/Customer";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/logout")
    public String loginOutPage() {
        return "login";
    }

}
