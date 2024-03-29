package guru.springframework.spr5didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.spr5didemo.services.GreetingServiceImpl;

public class InyeccionMediantePropiedadControllerTest {

	private InyeccionMediantePropiedadController inyectadoPorPropiedad;
	
	@Before
	public void setUp() throws Exception {
		this.inyectadoPorPropiedad = new InyeccionMediantePropiedadController();
		this.inyectadoPorPropiedad.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, inyectadoPorPropiedad.sayHello());
	}

}
