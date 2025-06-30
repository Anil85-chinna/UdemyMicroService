package com.currency.exchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.exchange.entity.CurrencyExchange;
import com.currency.exchange.repo.CurrencyExchangeRepo;

@RestController
public class CurrencyExchangeController {

	@Value("${server.port}")
	private String portNumber;

	@Autowired
	 CurrencyExchangeRepo currencyRepo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to) {
		// CurrencyExchange curencyExchange = new CurrencyExchange(1l, from, to,
		// BigDecimal.valueOf(10));
		CurrencyExchange curencyExchange = currencyRepo.findByFromAndTo(from, to);
		if (curencyExchange == null) {
			throw new RuntimeException("No data found from to " + from + " to " + to);
		}
		curencyExchange.setEnvironment(portNumber);
		return curencyExchange;

	}

}
