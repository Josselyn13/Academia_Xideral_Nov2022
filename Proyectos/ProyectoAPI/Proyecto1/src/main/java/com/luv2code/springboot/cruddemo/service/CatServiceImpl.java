package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.CatDAO;
import com.luv2code.springboot.cruddemo.entity.Cat;

@Service
public class CatServiceImpl implements CatService {

	
	private CatDAO catDAO;
	
	@Autowired
	public CatServiceImpl(@Qualifier("catDAOHibernateImpl") CatDAO theCatDAO) {
		catDAO = theCatDAO;
	}
	
	@Override
	@Transactional
	public List<Cat> findAll() {
		return catDAO.findAll();
	}

	@Override
	@Transactional
	public Cat findById(int theId) {
		return catDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Cat theCat) {
		catDAO.save(theCat);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		catDAO.deleteById(theId);
	}

}






