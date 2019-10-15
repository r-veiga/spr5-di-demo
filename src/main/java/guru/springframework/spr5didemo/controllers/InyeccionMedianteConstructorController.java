package guru.springframework.spr5didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spr5didemo.services.GreetingService;

/**
 * AUTOWIRED en el constructor de la clase es opcional
 *
 */
@Controller
public class InyeccionMedianteConstructorController {

	public GreetingService greetingService;
	
	public InyeccionMedianteConstructorController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
