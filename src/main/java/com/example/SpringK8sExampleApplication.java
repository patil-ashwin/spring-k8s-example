package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringK8sExampleApplication {

	public static void main(String[] args) {
		System.getenv().forEach((k, v) -> log.info("key: " + k + " value: " + v));
		SpringApplication.run(SpringK8sExampleApplication.class, args);

	}

}
