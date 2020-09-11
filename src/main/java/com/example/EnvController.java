package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

	@GetMapping("/env/{key}")
	public String getEnv(@PathVariable("key") String key) {
		return System.getenv().get(key);
	}

}
