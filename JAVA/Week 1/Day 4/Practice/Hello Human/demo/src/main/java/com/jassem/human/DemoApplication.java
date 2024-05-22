package com.jassem.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "Hello Human";
	}
	
	@RequestMapping("/name")
	public String name(@RequestParam(value="q") String searchQuery) {
		return "Hello " + searchQuery;
	}
	@RequestMapping("/last")
	public String lastName(@RequestParam(value="name") String name, @RequestParam(value="lastName") String lastName) {
		return "Hello " + name + "   "  + lastName;
	}
}
