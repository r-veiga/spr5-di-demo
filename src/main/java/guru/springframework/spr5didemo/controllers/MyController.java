package guru.springframework.spr5didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		System.out.println("Esto se ha escrito desde el interior de un @Controller method.");
		return "Hello es hola";
	}
}
