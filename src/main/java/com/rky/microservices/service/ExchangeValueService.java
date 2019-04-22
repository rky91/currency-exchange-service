package com.rky.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rky.microservices.bean.ExchangeValue;
import com.rky.microservices.repository.ExchangeValueRepository;

@Service
public class ExchangeValueService {
	
	@Autowired
	private ExchangeValueRepository repository;
	
	
	public ExchangeValue getExchangeValue(String from, String to) {
		
		return repository.findByFromAndTo(from, to);
		
	}
	
}
