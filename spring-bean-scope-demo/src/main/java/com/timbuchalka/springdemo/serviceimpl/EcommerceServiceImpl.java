package com.timbuchalka.springdemo.serviceimpl;

import java.util.Random;

import com.timbuchalka.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName + 
		" provides an outstanding ecommerce platform." +
		"\nThe annual revenue income exceeds " + random.nextInt(revenue);
		return service;
	}

}