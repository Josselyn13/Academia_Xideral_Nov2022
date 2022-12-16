package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.cruddemo.entity.Cat;
import com.luv2code.springboot.cruddemo.service.CatService;



@Controller
@RequestMapping("/mvc")
public class CatMvcController {

	// need to inject our cat service
	@Autowired
	private CatService catService;
	
	@GetMapping("/cats")
	public String listCats(Model theModel) {
		
		// get cats from the service
		List<Cat> theCats = catService.findAll();
				
		// add the cats to the model
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
		catService.save(theCat);	
		
		return "redirect:/mvc/cats";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("catId") int theId,
									Model theModel) {
		
		// get the cat from our service
		Cat theCat = catService.findById(theId);	
		
		// set cat as a model attribute to pre-populate the form
		theModel.addAttribute("cat", theCat);
		
		// send over to our form		
		return "cat-form";
	}
	
	@GetMapping("/delete")
	public String deleteCat(@RequestParam("catId") int theId) {
		
		// delete the customer
		catService.deleteById(theId);
		
		return "redirect:/mvc/cats";
	}

}










