package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class SpringThymeleaf {
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		String m="Hello From Spring Web MVC";
		model.addAttribute("mesg", m);
		return "sayHello";
	}
}
