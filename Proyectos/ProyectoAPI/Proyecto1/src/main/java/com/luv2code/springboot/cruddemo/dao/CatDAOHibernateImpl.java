package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Cat;

@Repository
public class CatDAOHibernateImpl implements CatDAO {

	// define field for entitymanager	
	private EntityManager entityManager;
		
	// set up constructor injection
	@Autowired
	public CatDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Cat> findAll() {
		System.out.println("CatDAOHibernateImpl");
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Cat> theQuery =
				currentSession.createQuery("from Cat", Cat.class);
		
		// execute query and get result list
		List<Cat> cats = theQuery.getResultList();
		
		// return the results		
		return cats;
	}


	@Override
	public Cat findById(int theId) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// get the cat
		Cat theCat =
				currentSession.get(Cat.class, theId);
		
		// return the cat
		return theCat;
	}


	@Override
	public void save(Cat theCat) {

		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// save employee
		currentSession.saveOrUpdate(theCat);
	}


	@Override
	public void deleteById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery(
						"delete from cat where id=:catId");
		
		theQuery.setParameter("catId", theId);
		
		theQuery.executeUpdate();
	}

}







