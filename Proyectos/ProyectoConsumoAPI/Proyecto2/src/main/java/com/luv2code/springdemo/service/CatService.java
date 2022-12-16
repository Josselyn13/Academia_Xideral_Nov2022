package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.Cat;


public interface CatService {

	public List<Cat> getCats();

	public void saveCat(Cat theCat);

	public Cat getCat(int theId);

	public void deleteCat(int theId);
	
}
