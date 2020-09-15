package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloController {

	@Autowired
	private PropertyConfiguration configuration;

	@GetMapping("/config")
	public String getConfigValues() {
		log.error("Hi!!");
		return String.format("firstName: %s lastName: %s Age: %s", configuration.getFirstName(),
				configuration.getLastName(), configuration.getAge());
	}

}
