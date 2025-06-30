package com.limits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limits.configuration.Configuration;
import com.limits.entity.Limits;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/getAllLimits")
	public Limits getAllLimits() {

		return new Limits(configuration.getMinimum(), configuration.getMaximum());

	}

}
