package com.ncc.gitTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello, world, 刘佳乐";
	}
}
