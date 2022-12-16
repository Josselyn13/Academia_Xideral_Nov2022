package com.luv2code.springdemo.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.luv2code.springdemo.model.Cat;



@Service
public class CatServiceRestClientImpl implements CatService {

	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public CatServiceRestClientImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url}") String theUrl) {
		
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	@Override
	public List<Cat> getCats() {
		
		logger.info("***OBTENER LISTA DE GATOS DESDE EL SERVICE REST CLIENTE");
		logger.info("in getCats(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<Cat>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
													 new ParameterizedTypeReference<List<Cat>>() {});

		// get the list of customers from response
		List<Cat> cats = responseEntity.getBody();

		logger.info("in getCats(): cats" + cats);
		
		return cats;
	}

	@Override
	public Cat getCat(int theId) {
		logger.info("***OBTENER UN GATO DESDE EL SERVICE REST GATO");

		logger.info("in getCat(): Calling REST API " + crmRestUrl);

		// make REST call
		Cat theCat = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
						Cat.class);

		logger.info("in saveCat(): theCat=" + theCat);
		
		return theCat;
	}

	@Override
	public void saveCat(Cat theCat) {

		logger.info("in saveCat(): Calling REST API " + crmRestUrl);
		
		int catId = theCat.getId();

		// make REST call
		if (catId == 0) {
			// add cat
			logger.info("***SALVAR UN GATO DESDE EL SERVICE REST GATO");

			restTemplate.postForEntity(crmRestUrl, theCat, String.class);			
		
		} else {
			// update cat
			logger.info("***ACTUALIZAR UN GATO DESDE EL SERVICE REST GATO");

			restTemplate.put(crmRestUrl, theCat);
		}

		logger.info("in saveCat(): success");	
	}

	@Override
	public void deleteCat(int theId) {
		logger.info("***BORRAR UN GATO DESDE EL SERVICE REST GATO");

		logger.info("in deleteCat(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("in deleteCat(): deleted cat theId=" + theId);
	}

}
