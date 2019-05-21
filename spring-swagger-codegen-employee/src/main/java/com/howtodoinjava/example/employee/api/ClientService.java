package com.howtodoinjava.example.employee.api;

import com.howtodoinjava.example.employee.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;


import java.util.Hashtable;

import org.springframework.stereotype.Service;


@Service
public class ClientService {
	Hashtable<String, Employee> clients = new Hashtable<String, Employee>();
	
	public ClientService() {
		Employee client = new Employee();
		client.setId("1");
		client.setOriginalChannel("Banca Serfin");
		client.setFullName("Aceves Gonzales Adolfo");
		client.setCondition("Cliente");
		client.setSegment("Premier");
		client.setAddress("Loma Bonita 1839");
		client.setCustomerCategory("Fìsica");
		clients.put("1", client);
		
	}
	
	public Employee getClient(String id) {
		if (clients.containsKey(id)) {
			return clients.get(id);
		}
		else
			return null;
	}
	
	public Hashtable<String, Employee> getAll(){
		return clients;
	}
}