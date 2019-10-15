package guru.springframework.spr5didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.spr5didemo.services.GreetingService;

/**
 * AUTOWIRED en el setter "setGreetingService"
 *
 */
@Controller
public class InyeccionMedianteSetterController {

	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	public void setGreetingService(@Qualifier("SetterGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
