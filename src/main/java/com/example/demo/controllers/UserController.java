package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.User;
import com.example.demo.repos.UserRepo;

@Controller
public class UserController {
	@Autowired
	private UserRepo repo;
	
	@RequestMapping("/show")
	public String showReg() {
		return "registerUser";
		
	}
	@RequestMapping("/registerUser")
	public String register(@ModelAttribute("user") User user,ModelMap modelmap) {
		repo.save(user);
		modelmap.addAttribute("msg", "User Registered");
		return "registered";
	}
	@RequestMapping("/login")
	public String signin() {
		return "login";
		
	}
	
	@RequestMapping("/logins")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap modelmap) {
		User user = repo.findByEmail(email);
		if(user.getPassword().equals(password)) {
			return "findflight";
		}
		else {
			modelmap.addAttribute("msg", "Invalid entry, pls retry"); 
			
		}
			
		
		
		return "login";
		
		}
}
