package com.limits.entity;

public class Limits {
	
	private int maximum;
	private int minimum;
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public Limits(int minimum, int maximun) {
		super();
		this.minimum = minimum;
		this.maximum = maximun;
	}
	public Limits() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
