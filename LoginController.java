package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.User;


@Controller
@RequestMapping("/welcome")
public class LoginController {
	@GetMapping("/demo")
    public ModelAndView helloWorld() {
		String message =  "Using Spring MVC 3";
		 
		 
		   return new ModelAndView("welcome", "welcomeMessage", message);
    }

	@GetMapping("/demo1")
    public ModelAndView helloWorld1() {
		String message =  "Using Spring MVC 3";
		 
		 
		   return new ModelAndView("welcome", "welcomeMessage", message);
    }
	
	@RequestMapping("/newuser")
    public String newUser(Model model) {
	System.out.println("I am in new User method..");
	model.addAttribute("user", new User());
	return "userForm";
    }
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user) {
	System.out.println("I am in add user");
	System.out.println(user.getFirstname());
	
	
	return "result";
    }

}
