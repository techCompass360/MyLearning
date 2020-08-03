package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.db.Employee;
import com.test.db.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private  EmployeeRepository  empRepository ;
	
  @RequestMapping("/hello")
  public String hello() {
    StringBuilder message = new StringBuilder("Hello Google App Engine!");
    try {
      InetAddress ip = InetAddress.getLocalHost();
      message.append(" From host: " + ip);
    } catch (UnknownHostException e) {
      e.printStackTrace();
    }
      return message.toString();
    }
  
  
	/*
	 * @PostMapping(path="/add") // Map ONLY POST Requests public @ResponseBody
	 * String addNewUser (@RequestParam String name , @RequestParam String email) {
	 * 
	 * Employee e = new Employee(); e.setName(name); e.setSkill("ETL");
	 * e.setDepartment("DWH"); e.setSalary(2000); empRepository.save(e); return
	 * "Saved"; }
	 */
  
  
  @GetMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser () {
   
	  Employee e = new Employee();
	 // e.setId(101);
	  e.setName("Test");
	  e.setSkill("ETL");
	  e.setDepartment("DWH");
	  e.setSalary(2000);
	  empRepository.save(e);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Employee> getAllUsers() {
    // This returns a JSON or XML with the users
    return empRepository.findAll();
  }
  
  
}