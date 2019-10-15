package guru.springframework.spr5didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.spr5didemo.services.GreetingServiceImpl;

public class InyeccionMedianteConstructorControllerTest {

	private InyeccionMedianteConstructorController inyeccionMedianteConstructorController;
	
	@Before
	public void setUp() throws Exception {
		this.inyeccionMedianteConstructorController = new InyeccionMedianteConstructorController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, inyeccionMedianteConstructorController.sayHello());
	}

}
