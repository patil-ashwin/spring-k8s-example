package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private PropertyConfiguration configuration;

	@GetMapping("/config")
	public String getConfigValues() {
		return String.format("firstName: %s lastName: %s Age: %s", configuration.getFirstName(),
				configuration.getLastName(), configuration.getAge());
	}

}
