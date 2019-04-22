package com.rky.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rky.microservices.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);

}
