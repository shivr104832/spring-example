package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CustomerService {
	
	@Autowired
	List<Customer> custList;

	
	//five class created
	//3 customer
	//1 customerservice
	//1 arrayList
}
