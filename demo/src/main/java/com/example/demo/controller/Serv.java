package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Dao.Servicelayer;
import com.example.demo.Helperclass.ControllerException;
import com.example.demo.entity.Employee;

@RestController
public class Serv {

	
	  @Autowired private Servicelayer servicelayer;
	

	@GetMapping({ "/start", "/" })
	public ModelAndView M1() {
		System.out.println("controller");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");
		return mv;

		// return new ModelAndView("Welcome");
	}

	@GetMapping("/login")
	public ModelAndView home() {
		System.out.println("home");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}

	
	 @GetMapping(value="/helo/{id}")
	 public Employee getDetails(@PathVariable int id){
	 
	  System.out.println("controller");
	  
	 //RestTemplate template=new RestTemplate(); //String body =
	  //template.exchange(url, HttpMethod.GET,null,String.class).getBody();
	  
	  
	  //System.out.println(body.toString()); System.out.println(body);
	 
		  return servicelayer.addEmployee(id);
	
	 
	  // Object[] s=template.getForObject(url,Object[].class); // return Arrays.asList(s);
	  
	  
	  
	  }
	 

	
	 @GetMapping(value = "/search") 
	 public ModelAndView search(@RequestParam String id) { 
		 int id1 = Integer.parseInt(id);
	  System.out.println(servicelayer.getByempid(id1)); 
	  ModelAndView m = new ModelAndView();
	  Employee ee = servicelayer.getByempid(id1);
	  m.addObject("ee",ee);
	  m.setViewName("Display"); 
	  return m;
	  }
	 

	
	  @GetMapping(value = "/hello/{name}") 
	  public Employee getDetails(@PathVariable String name) throws ControllerException  { 
		  System.out.println("Hi");
	  
	  return servicelayer.getByName(name);
	  }
	 
	  @GetMapping(value="/hello/all")
	  public List<Employee> getAllEmplyees(Employee e) {
		  return servicelayer.addEmployeeAll(e);
	  }
}


