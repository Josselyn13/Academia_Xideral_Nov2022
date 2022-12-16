package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.model.Cat;
import com.luv2code.springdemo.service.CatService;



@Controller
@RequestMapping("/cat")
public class CatController {

	// need to inject our dog service
	@Autowired
	private CatService catService;
	
	@GetMapping("/list")
	public String listCats(Model theModel) {
		
		// get customers from the service
		List<Cat> theCats = catService.getCats();
				
		// add the customers to the model
		theModel.addAttribute("cats", theCats);
		
		return "list-cats";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Cat theCat = new Cat();
		
		theModel.addAttribute("cat", theCat);
		
		return "cat-form";
	}
	
	@PostMapping("/saveCat")
	public String saveCat(@ModelAttribute("cat") Cat theCat) {
		
		// save the customer using our service
		catService.saveCat(theCat);	
		
		return "redirect:/cat/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("catId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Cat theCat = catService.getCat(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("cat", theCat);
		
		// send over to our form		
		return "cat-form";
	}
	
	@GetMapping("/delete")
	public String deleteCat(@RequestParam("catId") int theId) {
		
		// delete the customer
		catService.deleteCat(theId);
		
		return "redirect:/cat/list";
	}
}










