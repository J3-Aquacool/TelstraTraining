package com.methodreference.demo;

import java.util.Arrays;
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
				new Products(101," ", description, price, brand),
				new Products(502,"", description, price, brand),
				new Products(303," ", description, price, brand),
				new Products(210," ", description, price, brand)
				
				
				);
		
		
		// Tasks to be performed
		// Add ur data has per ur choice to the above code
		// 1. Sort by brands name
		// create one method whih will print all elemnts in the list
		// create a method that prints all products  whose brand name starts with  p
		
	}

}
