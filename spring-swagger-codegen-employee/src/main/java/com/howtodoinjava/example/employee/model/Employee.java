package com.howtodoinjava.example.employee.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

public class Employee {
	String id;
	String originalChannel;
	String fullName;
	String condition;
	String segment;
	String address;
	String customerCategory;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOriginalChannel() {
		return originalChannel;
	}
	public void setOriginalChannel(String originalChannel) {
		this.originalChannel = originalChannel;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustomerCategory() {
		return customerCategory;
	}
	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}
	
	
}
