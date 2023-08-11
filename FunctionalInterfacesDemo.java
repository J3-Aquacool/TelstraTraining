package com.demo.functioninterfaces;


// Unitl Java7

//
interface DeviceApi
{
	
	abstract void checkSound();
	abstract void checkVideo();
	abstract void checkDisplay();
	 default void checkTocuhDisplay(){
		 
	 }
	 }
	
	
	




class SonyDevice implements DeviceApi
{

	@Override
	public void checkSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkDisplay() {
		// TODO Auto-generated method stub
		checkTocuhDisplay();
	}

	
	
}


class SamsungDevice implements DeviceApi
{

	@Override
	public void checkSound() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void checkVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkDisplay() {
		// TODO Auto-generated method stub
		
	}

	
	
}
// After Java 8
// This will automatically qualif has functional interface
@FunctionalInterface
interface MemoryManagementApi
{
	
	void checkMemory();

	
}




public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Runnable r=()->
				{
			System.out.println("hello all");
				};
				
				

	DeviceApi dev=()->
	{
		
	};
	
	MemoryManagementApi mem=()->
	{
		
	};
	
	}




}


