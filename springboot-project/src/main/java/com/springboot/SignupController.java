package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.service.SigniupService;

@Controller
public class SignupController {
 
	@Autowired
	private SigniupService service;
	
	@GetMapping("/hello")
	public String view() {
		return "redirect:index";
	}
	
	@GetMapping("/showNewuser")
	public String showNewuser(Model model) {
		SignupDto signupDto=new SignupDto();
		model.addAttribute("signupDto", signupDto);
		return "redirect:signup";
	}
	
	@PostMapping("/sign")
	public String saveUser(SignupDto dto) {
		service.saveuser(dto);
		return "redirect:login";
	}
}
