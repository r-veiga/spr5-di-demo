package guru.springframework.spr5didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		System.out.println("Hello, this returned from a @Controller method.");
		return "Hello, hello";
	}
}
