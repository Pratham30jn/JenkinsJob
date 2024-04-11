package com.jenk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/get")
	public String get() {
		return "Hello Pratham";
	}

}
