package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/test")
public class TestController {

	@GetMapping("/index")
	public String index() {
		return "SpringBoot API Test Successful and working with Jenkins, as well as working with Azure VM, Maven, Jenkins, Docker & Azure  AKS";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "SpringBoot API Test Successful with hello API call";
	}

	@GetMapping("/hi123")
	public String hi() {
		return "SpringBoot API Test Successful with hello API call, working with Azure VM, Maven, Jenkins, Docker & Azure  AKS";
	}

	@GetMapping("/diff")
	public String diff() {
		return "IP address of Loadbalancer is used..";
	}

}
