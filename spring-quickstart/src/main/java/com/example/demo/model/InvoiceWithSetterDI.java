package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("inv2")
@NoArgsConstructor
@Setter
@ToString
public class InvoiceWithSetterDI {
	
	private Customer customer;
	
	//Field Injection
	@Autowired
	private Product product;

	//Setter Injection
	@Autowired
	public void setCustomer(@Qualifier("ram")Customer customer) {
		this.customer = customer;
	}

}
