package com.luv2code.springboot.cruddemo.dao;

import java.util.List;
import com.luv2code.springboot.cruddemo.entity.Cat;

public interface CatDAO {

	List<Cat> findAll();
	
	Cat findById(int theId);
	
	void save(Cat theCat);
	
	void deleteById(int theId);
	
}
