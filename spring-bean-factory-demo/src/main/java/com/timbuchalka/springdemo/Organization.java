package com.timbuchalka.springdemo;

public class Organization {
	
	private String companyName;
	private int yearOfIncorporation;
	
	/*
	public Organization() {
	}
	*/
	
	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}	
	
	public static Organization createInstance(String companyName, int yearOfIncorporation) {
		System.out.println("Invoking the static factory method");
		return new Organization(companyName, yearOfIncorporation);
	}
	
	public void corporateSlogan() {
		String slogan = "We build the ultimate driving machines!";
		System.out.println(slogan);
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

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}

}
