package com.apalya.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PropertiestTest implements CommandLineRunner{

	@Value("${com.apalya.id}")
	private String id;
	
	@Value("${com.apalya.name}")
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "PropertiestTest [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

	
	
	
}
