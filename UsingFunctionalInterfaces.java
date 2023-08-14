package com.demo.predefinedfunctionalinterfaces.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

// 1. Lets display only those products which belong to the brand Dettol

public class UsingFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> product=Arrays.asList(
				new Products(101, "Shampoo", "Long and Strong Hair", 100, "Pantine"), 
				new Products(502, "Body wash", "Smooth and clear skin", 200, "Lux"), 
				new Products(303, "Baby Soap", "for babies", 150, "J&J"), 
				new Products(210, "Hand Wash", "Kills 99.9% germs", 50, "Dettol"),
				new Products(209, "Soap", "Kills 99.9% germs", 50, "Dettol")
				
				);
		
		Predicate<Products> dettolbrand=(Products p)->p.getBrand().equals("Dettol");
		List <Products> newdata=new ArrayList<>();
		
		for(Products p: product)
		{
		if(dettolbrand.test(p))
		{
			newdata.add(p);
					
		}
			
	    }// end of for
		
		//System.out.println(newdata);
		
		
		// One more way
		
		
		//String data="Rahul";
		// My task is to check weather any data in that string object contains more tha 5 characters
		
		Predicate<String> check=(s)->s.length() >5;
		System.out.println(check.test("Java"));
		
	String username="Rahul";
	
	Predicate<String> checkuser=(s)->s.equals(username);
	
	System.out.println(checkuser.test("Rahul"));
	
	
	// With method refernce
	
	
	
	Predicate<String>checkempty=String::isEmpty;
	System.out.println(checkempty.test("java"));
	System.out.println(checkempty.negate().test("java"));
	
	
	
	// How to use Consumer
	
	//Consumer <String> c=(data)->System.out.println(data);
	//c.accept("Welcome Function Programming");
	
	
	/*Consumer<Products> cp=(pdata)->System.out.println(pdata.getProname());
	cp.accept(new Products(101, "Shampoo", "Long and Strong Hair", 100, "Pantine"));
	*/

	
	Consumer<Products> cp1=(pdata1)->System.out.println(pdata1.getProname() +" "  +pdata1.getDescription());
	for(Products x:product)
	{
	cp1.accept(x);

	}
	
	
	
	// 
	Supplier <Products> sup=()->new Products(109, "xxx","yyy", 10, "klm");
	
	System.out.println(sup.get());

	//product.add(sup.get());
	
	
	Supplier<Date> supdate=UsingFunctionalInterfaces:: getTodaysDate;
	System.out.println("Todays Date:"+supdate.get());
	
	
	
	
	
	}
	
	
	public static Date getTodaysDate()
	{
		return new Date();
		
	}

	
}// end of main class

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



		
		


