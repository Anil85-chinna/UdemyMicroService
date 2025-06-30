package com.currency.conversion.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currency.conversion.entity.CurrencyConversion;
//
//@FeignClient(name = "currency-exchange")
//public interface CurrencyExchangeProxy {
//
//	@GetMapping("/curency-exchange/from/{from}/to/{to}")
//	public CurrencyConversion retriveExchangeValue(@PathVariable String from, @PathVariable String to);
//
//}

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);
}

