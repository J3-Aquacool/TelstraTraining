package com.methodreference.demo;

// imagine we have functional interface

// And lets also Image there is functionalty which we wnat use

interface Calculator
{
	double getSqrtValue(int m);
	
	
}
interface GetAppData
{
	App getApp(String s);
	
	
}

interface HandleButtonEvents
{
	
	void onClick();
/*	default String getData(String s)
	{
		
		return s;
	}
	*/
}

class App
{
	
	App()
	{
		System.out.println("Inside a constructor");
	}
	
	
	App(String s)
	{
		
		System.out.println("Helo:"+s);
	}
	static void ButtonClick()
	{
		System.out.println("Button Clicked");
		
	}
	
	void ButtonPressed()
	{
		
		System.out.println("Button Pressed");
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		
		// I want to find out the Square root of some given numeric value
		// In java we have a class
		
		System.out.println((int)Math.sqrt(10));
		// How about attaching this sqrt functionality to an already available
		// functionalinterafce
		
		
		Calculator c=(m)->Math.sqrt(m);
		System.out.println(c.getSqrtValue(10));
		
		
		// if i have to do the same using method reference
		
		
		Calculator c1=Math::sqrt; // static method reference
		System.out.println(c1.getSqrtValue(9));
		
		HandleButtonEvents event=App::ButtonClick;
		event.onClick();
		App myapp=new App();
		HandleButtonEvents event1=myapp::ButtonPressed;
		event1.onClick();
		HandleButtonEvents event2=App::new;
		
		GetAppData event3=App::new;//new App();
		event3.getApp("abc");
		
		
		
		
		
		
	}

}
