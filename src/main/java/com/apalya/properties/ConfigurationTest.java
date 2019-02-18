package com.apalya.properties;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("com.apalya")
@Component
public class ConfigurationTest implements CommandLineRunner{
	
	private int id;
	private String model;
	//private List<String> prjm;
	private Set<String> prjm;
	private Department dept;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public Set<String> getPrjm() {
		return prjm;
	}
	public void setPrjm(Set<String> prjm) {
		this.prjm = prjm;
	}
     
	
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	

	@Override
	public String toString() {
		return "ConfigurationTest [id=" + id + ", model=" + model + ", prjm=" + prjm + ", dept=" + dept + "]";
	}

	@Override
	public void run(String... args) throws Exception {      
		System.out.println(this);	
	}
	
}