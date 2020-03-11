package com.crud.text;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClothDto implements Serializable   
	{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // automatic generation of primarykey
 	private int id;  // only instance varibles   static cant be serilizable
	private String type;
	private String color;
	private String brand;
	private String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public ClothDto() {
		super();
	}
	
	
	
}
