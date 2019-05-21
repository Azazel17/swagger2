package com.howtodoinjava.example.employee.api;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.example.employee.model.Employee;

import com.howtodoinjava.example.employee.model.Employee;
import com.howtodoinjava.example.employee.api.ClientService;;

@RestController
@RequestMapping("/clients")
public class FindEmployeeDetailsApiController {

	@Autowired
	ClientService cs;
	
	@RequestMapping("/all")
	public Hashtable<String, Employee> getAll() {
		return cs.getAll();
	}
	
	@GetMapping
	public Employee getClients(@RequestParam(value="id") String id) {
		return cs.getClient(id);
	}
	
}

