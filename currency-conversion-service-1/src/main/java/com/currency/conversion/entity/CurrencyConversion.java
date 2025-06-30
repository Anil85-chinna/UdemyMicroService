package com.currency.conversion.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyConversion {
	@Id
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMUltiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmmount;
	private String enviroment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMUltiple() {
		return conversionMUltiple;
	}

	public void setConversionMUltiple(BigDecimal conversionMUltiple) {
		this.conversionMUltiple = conversionMUltiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmmount() {
		return totalCalculatedAmmount;
	}

	public void setTotalCalculatedAmmount(BigDecimal totalCalculatedAmmount) {
		this.totalCalculatedAmmount = totalCalculatedAmmount;
	}

	public String getEnviroment() {
		return enviroment;
	}

	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	public CurrencyConversion(Long id, String from, String to, BigDecimal conversionMUltiple, BigDecimal quantity,
			BigDecimal totalCalculatedAmmount, String enviroment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMUltiple = conversionMUltiple;
		this.quantity = quantity;
		this.totalCalculatedAmmount = totalCalculatedAmmount;
		this.enviroment = enviroment;
	}

	public CurrencyConversion() {
		super();
		// TODO Auto-generated constructor stub
	}

}
