package com.webappdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.webappdemo.DAO.CityDAO;
import com.webappdemo.model.City;

@Controller
public class CityController {

	@Autowired
	CityDAO cDAO;
	
	@RequestMapping("insertNewCity")
	public String insertNewCity()
	{
		return "insertCity";
	}
	
	@RequestMapping("addCity")
	public String addCity(City c)
	{
		cDAO.save(c);
		return "redirect:/";	
	}
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("City");
		List<City> city = (List<City>) cDAO.findAll();
		mv.addObject("cityList",city);
		return mv;
	}
	
	@RequestMapping("/editCity/{id}")
	public ModelAndView editCity(@PathVariable Integer id)
	{
		ModelAndView mv = new ModelAndView("/editCity");
		City c = cDAO.findById(id).orElse(new City());
		mv.addObject("cityById",c);
		return mv;		
	}
	
	@RequestMapping("updateCity")
	public String updateCity(City c)
	{
		 cDAO.save(c);
		return "redirect:/";
	}
	
	@RequestMapping("/deleteCity/{id}")
	public String deleteCity(@PathVariable Integer id)
	{
		cDAO.deleteById(id);
		return "redirect:/"	;	
	}
	
	
	
}
