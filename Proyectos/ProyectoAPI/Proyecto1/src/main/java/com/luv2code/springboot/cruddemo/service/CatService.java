package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import com.luv2code.springboot.cruddemo.entity.Cat;



public interface CatService {

	public List<Cat> findAll();
	
	public Cat findById(int theId);
	
	public void save(Cat theCat);
	
	public void deleteById(int theId);
	
}
