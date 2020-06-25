package com.stackroute.eureka.client2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greeting")
public class GreetingController {
	
	public static final Logger LOG = LoggerFactory.getLogger(GreetingController.class);
	@GetMapping("/hello")
	public String sayHello() {
		LOG.info("Inside Greeting Controller");
		return "hello from Greeetingservice";
		
	}

}
