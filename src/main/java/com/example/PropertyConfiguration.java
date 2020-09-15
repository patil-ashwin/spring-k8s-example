package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "example")
@Data
public class PropertyConfiguration {
	
	private String firstName;
	private String lastName;
	private int age;

}
