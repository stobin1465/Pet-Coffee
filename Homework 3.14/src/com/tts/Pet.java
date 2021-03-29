package com.tts;
import java.util.*;

class Pet1 {
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	public Pet1() {
		
		
	}
	
	public Pet1(String name, int age, String location, String type) {
		
		this.name = name;
		this.location = location;
		this.age = age;
		this.type = type;
		
	}

	public String getName() {
		return this.name; 
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return this.type; 
	}
	public void setType(String type) {
		this.type = type;
	}
}





