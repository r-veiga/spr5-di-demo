package guru.springframework.spr5didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spr5didemo.services.GreetingService;

/**
 * AUTOWIRED en la propiedad de la clase "greetingService"
 *
 */
@Controller
public class InyeccionMediantePropiedadController {

	@Autowired
	@Qualifier("propiedadGreetingService")
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
