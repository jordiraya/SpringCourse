package com.timbuchalka.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.timbuchalka.springdemo.service.BusinessService;

public class Organization {
	
	private String companyName;
	private int yearOfIncorporation;
	
	@Value("${org.postalCode}")
	private String postalCode;
	
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;	
	
	public Organization() {
		System.out.println("default constructor called");
	}
	
	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("args constructor called");
	}	
	
	public void postConstruct() {
		System.out.println("organization: postConstruct method called");
	}
	
	public void preDestroy() {
		System.out.println("organization: preDestroy method called");
	}
	
	/*
	// defined in beans-cp.xml
	public void initialize() {
		System.out.println("organization: initialize method called");
	}
	
	// defined in beans-cp.xml
	public void destroy() {
		System.out.println("organization: destroy method called");
	}	
	*/
	
	
	public String corporateSlogan() {
		return slogan;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getYearOfIncorporation() {
		return yearOfIncorporation;
	}

	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		System.out.println("setPostalCode called");
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
		System.out.println("setEmployeeCount called");
	}	
	
	@Autowired
	public void setSlogan(@Value("${org.slogan}") String slogan) {
		this.slogan = slogan;
		System.out.println("setSlogan called");
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
		System.out.println("setBusinessService called");
	}

	public String corporateService() {
		return businessService.offerService(companyName);
	}
	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + ", slogan=" + slogan 
				+ "]";
	}

}
