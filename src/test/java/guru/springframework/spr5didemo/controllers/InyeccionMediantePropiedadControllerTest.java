package guru.springframework.spr5didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.spr5didemo.services.GreetingServiceImpl;

public class InyeccionMediantePropiedadControllerTest {

	private InyeccionMediantePropiedadController inyeccionMediantePropiedadController;
	
	@Before
	public void setUp() throws Exception {
		this.inyeccionMediantePropiedadController = new InyeccionMediantePropiedadController();
		this.inyeccionMediantePropiedadController.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, inyeccionMediantePropiedadController.sayHello());
	}

}
