package com.svk.GithubActions_cicid_3_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsCicid3ExampleApplication {

	@GetMapping
	public static String welcome()
	{
		return"Welcome SVK";
	}


	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCicid3ExampleApplication.class, args);
	}

}
