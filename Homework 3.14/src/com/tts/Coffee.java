package com.tts;

public class Coffee {
	//varables
	private String type;
	private int price;
	private String roast;
	
	/* --------Constructors ----------*/
	public Coffee() {
		
	}
	
	public Coffee(String type, int price, String roast) {
		this.type = type;
		this.price = price;
		this.roast = roast;
			
	}
	
	public Coffee(String type, int price) {
		this.type = type;
		this.price = price;
		
	}
	
	//methods
	public String sayGreeting() {
		return "Thank you for your order";
	}
	
	public boolean isLightRoast() {
		boolean light = true; 
		if(roast.equals("dark")) {
			light= false;
			
		}
		return light;
	}
	
	/* -------- Getters and Setters ---------*/
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice( ) {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRoast() {
		return this.roast;
	}
	public void setRoast(String roast) {
		this.roast = roast;
	}
	
	
}




