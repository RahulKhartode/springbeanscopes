package com.poc.springbeanscope;

public class SingletonScopedBean  {

	private String value;
	
	public SingletonScopedBean() {
		System.out.println("SingletonScopedBean created");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public PrototypeScopedBean getPrototypeScopedBean() {
		return null;
	}
	
	
}
