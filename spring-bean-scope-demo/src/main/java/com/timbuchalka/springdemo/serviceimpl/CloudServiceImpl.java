package com.timbuchalka.springdemo.serviceimpl;

import java.util.Random;

import com.timbuchalka.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName + 
				" offers world class Cloud computing infraestructure." +
				"\nThe annual revenue income exceeds " + random.nextInt(revenue);
		return service;
	}

}
