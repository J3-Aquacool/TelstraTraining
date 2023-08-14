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


		
		


public class ForEachUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Products> product=Arrays.asList(
				new Products(101, "Shampoo", "Long and Strong Hair", 100, "Pantine"), 
				new Products(502, "Body wash", "Smooth and clear skin", 200, "Lux"), 
				new Products(303, "Baby Soap", "for babies", 150, "J&J"), 
				new Products(210, "Hand Wash", "Kills 99.9% germs", 50, "Dettol")
				
				
				);
		
		for(int i=0;i<product.size();i++)
		{
			
			System.out.println("Names:"+product.get(i));
		}
		
		for(Products x:product)
		{
			System.out.println("using enhancede for:"+x);
			
		}
		
		
		product.forEach((p)->System.out.println("Using For eACH:"+p));
		
		product.forEach(System.out::println); // instance based method refernce
	}

}
