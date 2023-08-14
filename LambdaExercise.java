package com.methodreference.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Products
{
int pid;
String proname;
String description;
double price;
String brand;
public Products(int pid, String proname, String description, double price,
		String brand) {
	super();
	this.pid = pid;
	this.proname = proname;
	this.description = description;
	this.price = price;
	this.brand = brand;
}
public int getPid() {
	return pid;
}
public String getProname() {
	return proname;
}
public String getDescription() {
	return description;
}
public double getPrice() {
	return price;
}
public String getBrand() {
	return brand;
}
public void setPid(int pid) {
	this.pid = pid;
}
public void setProname(String proname) {
	this.proname = proname;
}
public void setDescription(String description) {
	this.description = description;
}
public void setPrice(double price) {
	this.price = price;
}
public void setBrand(String brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Products [pid=" + pid + ", proname=" + proname + ", description="
			+ description + ", price=" + price + ", brand=" + brand + "]";
}

	
}


public class LambdaExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Products> product=Arrays.asList(
				new Products(101, "Shampoo", "Long and Strong Hair", 100, "Pantine"), 
				new Products(502, "Body wash", "Smooth and clear skin", 200, "Lux"), 
				new Products(303, "Baby Soap", "for babies", 150, "J&J"), 
				new Products(210, "Hand Wash", "Kills 99.9% germs", 50, "Dettol")
				
				
				);
		
		


		
		// Tasks to be performed
		// Add ur data has per ur choice to the above code
		// 1. Sort by brands name
		
		Collections.sort(product,(p1,p2) -> p1.getBrand().compareTo(p2.getBrand()));
		
		
		System.out.println(product);
		
		
		
		// create one method whih will print all elemnts in the list
		
		print(product);
		
		// create a method that prints all products  whose brand name starts with  p
		
		printCondition(product,p->p.getBrand().endsWith("P") );
		
		
		printCondition(product,p->p.getBrand().startsWith("P") );
		
	}

	
	
	
	public static void print(List<Products> p)
	{
		
		for(Products pro:p)
		{
			
			System.out.println(pro);
		}
	}



public static void printCondition(List<Products> p,CheckCondition c)
{
	
	for(Products pro:p)
	{
		if(c.test(pro))
		{
			System.out.println(pro);
		}
	}
}



}


interface CheckCondition
{
	
	boolean test(Products p);
	
}

