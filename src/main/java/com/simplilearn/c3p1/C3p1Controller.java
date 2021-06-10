package com.simplilearn.c3p1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C3p1Controller {
	@RequestMapping("/")
	public String hello() {
		return "Hello, World!";
	}
}

