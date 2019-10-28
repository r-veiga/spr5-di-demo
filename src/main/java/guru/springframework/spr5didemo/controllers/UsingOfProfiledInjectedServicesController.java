package guru.springframework.spr5didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.spr5didemo.services.GreetingService;

/**
 * AUTOWIRED en el constructor de la clase es opcional
 *
 */
@Controller("profiledController")
public class UsingOfProfiledInjectedServicesController {

	@Autowired
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
