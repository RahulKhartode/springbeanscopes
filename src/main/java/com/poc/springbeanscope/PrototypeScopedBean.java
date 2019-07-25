package com.poc.springbeanscope;

public class PrototypeScopedBean {

	private String value;
	
	public PrototypeScopedBean() {
		System.out.println("PrototypeScopedBean created");
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
