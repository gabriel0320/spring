package com.udemy.backendninja.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.model.Person;




@Controller
@RequestMapping("/example")
public class ExampleController {
	// Primera forma
	
	public static final String EXAMPLE_VIEW = "example";
	
	@GetMapping("/exampleString")
	 public String exampleString(Model model) {
		model.addAttribute("people", getPeople());
		 return EXAMPLE_VIEW;
		 
	 }	
	// Segunda forma
	
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("people",getPeople());
		return mav;
	}
	
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<>();
		people.add(new Person("Jhon",23));
		people.add(new Person("Gabriel",27));
		people.add(new Person("Veronica",30));
		people.add(new Person("Jacky",1));
		people.add(new Person("Lennon",1));
		
		return people;
		
	}

}
