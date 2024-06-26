package com.ajBinary.entity;

import java.util.HashSet;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {//Car.java 


	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	 private String brand, model, color , registerNumber;
	 private int year , price;
	 @ManyToOne(fetch =FetchType.LAZY)
	 @JoinColumn(name = "owner")
	 private Owner owner;
	 
	 public Car( String brand, String model, String color, String registerNumber, int year, int price,Owner owner) {
	        this.brand = brand;
	        this.model = model;
	        this.color = color;
	        this.registerNumber = registerNumber;
	        this.year = year;
	        this.price = price;
	        this.owner=owner;
	    }

	    public Owner getOwner() {
	        return owner;
	    }

	    public void setOwner(Owner owner) {
	        this.owner = owner;
	    }
	//setters and getters 

	 public Car(){}

	    public Car( String brand, String model, String color, String registerNumber, int year, int price) {
	        this.brand = brand;
	        this.model = model;
	        this.color = color;
	        this.registerNumber = registerNumber;
	        this.year = year;
	        this.price = price;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getRegisterNumber() {
	        return registerNumber;
	    }

	    public void setRegisterNumber(String registerNumber) {
	        this.registerNumber = registerNumber;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }
	 // Car.java
//	    @ManyToMany(mappedBy="cars")
//	    private Set<Owner> owners = new HashSet<Owner>();
//	    public Set<Owner> getOwners() {return owners;}
//	    public void setOwners(Set<Owner> owners) {this.owners = owners;}


	}
