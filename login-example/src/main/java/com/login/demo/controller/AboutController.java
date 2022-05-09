package com.login.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.demo.entity.UserRegistration;
import com.login.demo.service.UserService;

@Controller
@RequestMapping("/about")
public class AboutController {
	
   /* private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistration userRegistration() {
        return new UserRegistration();
    }*/
	
	@GetMapping
	public String showAboutForm() {
		return "about";
	}
	
	/*@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistration registration) {
		userService.save(registration);
		return "redirect:/registration?success";
	}*/
}
