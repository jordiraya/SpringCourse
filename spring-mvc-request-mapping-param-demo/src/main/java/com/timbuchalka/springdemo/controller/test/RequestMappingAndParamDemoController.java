package com.timbuchalka.springdemo.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value="/requestMappingAndParamDemo")
@Controller
public class RequestMappingAndParamDemoController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(RequestMappingAndParamDemoController.class);
	
	@RequestMapping(value="/home")
	public String home() {
		// the final mapping will be /requestMappingAndParamDemo/home
		return "requestMappingAndParamHome";
	}
	
	// test 1 Testing @RequestParam without explicit attributes
	@RequestMapping(value="/test1")
	public String requestMappingAndParamTest1(@RequestParam("orgname") String orgName, Model model) {
		model.addAttribute("orgname", orgName);
		model.addAttribute("testserial", "test1");
		return "requestMappingAndParamResults";
	}
	
	// test 2 Testing @RequestMapping without explicit attributes
	@RequestMapping(value="/test2", method = RequestMethod.GET)
	public String requestMappingAndParamTest2(@RequestParam("orgname") String orgName, Model model) {
		model.addAttribute("orgname", orgName);
		model.addAttribute("testserial", "test2");
		return "requestMappingAndParamResults";		
	}
	
	// test 3 Testing @RequestMapping fall back feature (usually used for a custom 404 page)
	@RequestMapping(value="*", method = RequestMethod.GET)
//	@RequestMapping(value="*", method = {RequestMethod.GET, RequestMethod.GET})
	public String requestMappingAndParamTest3() {
		return "fallback";		
	}	
}
