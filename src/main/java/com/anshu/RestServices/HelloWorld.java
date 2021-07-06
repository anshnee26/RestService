package com.anshu.RestServices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping(path = "/helloWorld")
	public String getHelloWorld() {

		return "Hello World. Are you listening?";
	}

	@GetMapping(path="/helloWorldBean")
	public HelloWorldBean getlloWorldBean() {

		return new HelloWorldBean ("Hello World from Bean");

	}

	@GetMapping(path="/helloWorldBean/path-variable/{name}")
	public HelloWorldBean getlloWorldBeanpathVariable(@PathVariable String name) {

		return new HelloWorldBean ("Hello World Are you, "+name);

	}

}
