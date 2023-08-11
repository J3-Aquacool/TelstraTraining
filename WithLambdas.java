package com.demo.onusinglamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer 

{
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public Customer( String name,int id) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}



public class WithLambdas {

	public static void main(String[] args) {
		

				List<Customer> cust=new ArrayList<Customer>();
				cust.add(new Customer("Rahul",101));
				cust.add(new Customer("Akash",201));
				cust.add(new Customer("Narsimha",161));
				cust.add(new Customer("Niteesh",90));
				
		// sorting by name
		Comparator <Customer> customeromparator=(Customer c1,Customer c2)->
		{
			
			return c1.getName().compareTo(c2.getName());
			
		};
		Collections.sort(cust,customeromparator);
		System.out.println(cust);
		
		
// Sorting by id
		Comparator <Customer> customeromparator1=(Customer c1,Customer c2)->
		{
			
		if(c1.getId() < c2.getId())
			
			return -1;
		else if(c1.getId() > c1.getId())
			return 1;
		
		else
			return 0;
		};
		Collections.sort(cust,customeromparator1);
		System.out.println(cust);
		
		
	}

}
