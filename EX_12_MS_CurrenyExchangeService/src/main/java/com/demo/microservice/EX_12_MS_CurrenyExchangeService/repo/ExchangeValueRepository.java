package com.demo.microservice.EX_12_MS_CurrenyExchangeService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.microservice.EX_12_MS_CurrenyExchangeService.bean.ExchangeValueEntity;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValueEntity, Long> {

	ExchangeValueEntity findByFromAndTo(String from, String to);

}
