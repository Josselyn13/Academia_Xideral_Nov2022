package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Cat;
import com.luv2code.springboot.cruddemo.service.CatService;

@RestController
@RequestMapping("/rest")
public class CatRestController {

	private CatService catService;
	
	@Autowired
	public CatRestController(CatService theCatService) {
		catService = theCatService;
	}
	
	// expose "/cats" and return list of dogs
	@GetMapping("/cats")
	public List<Cat> findAll() {
		return catService.findAll();
	}

	// add mapping for GET /cats/{catId}
	
	@GetMapping("/cats/{catId}")
	public Cat getCat(@PathVariable int catId) throws Exception {
		
		Cat theCat = catService.findById(catId);
		
		if (theCat == null) {
			throw new Exception("Cat id not found - " + catId);
		}
		
		return theCat;
	}
	
	// add mapping for POST /employees - add new employee
	
	@PostMapping("/cats")
	public Cat addCat(@RequestBody Cat theCat) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theCat.setId(0);
		
		catService.save(theCat);
		
		return theCat;
	}
	
	// add mapping for PUT /employees - update existing employee
	
	@PutMapping("/cats")
	public Cat updateCat(@RequestBody Cat theCat) {
		
		catService.save(theCat);
		
		return theCat;
	}
	
	// add mapping for DELETE /employees/{employeeId} - delete employee
	
	@DeleteMapping("/cats/{catId}")
	public String deleteCat(@PathVariable int catId) {
		
		Cat tempCat = catService.findById(catId);
		
		// throw exception if null
		
		if (tempCat == null) {
			throw new RuntimeException("Cat id not found - " + catId);
		}
		
		catService.deleteById(catId);
		
		return "Deleted cat id - " + catId;
	}
	
}










