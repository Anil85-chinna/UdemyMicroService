package com.currency.conversion.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.conversion.entity.CurrencyConversion;
import com.currency.conversion.fegin.CurrencyExchangeProxy;

@RestController
public class CurrencyConversionController {

	
	@Autowired
	private CurrencyExchangeProxy proxyFegin;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
	CurrencyConversion currencyConversion = proxyFegin.retrieveExchangeValue(from, to);
		return currencyConversion;

	}

}
