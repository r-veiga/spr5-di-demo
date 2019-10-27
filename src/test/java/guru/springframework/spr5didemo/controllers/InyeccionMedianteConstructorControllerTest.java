package guru.springframework.spr5didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.spr5didemo.services.GreetingServiceImpl;

public class InyeccionMedianteConstructorControllerTest {

	private InyeccionMedianteConstructorController inyectadoPorConstructor;
	
	@Before
	public void setUp() throws Exception {
		GreetingServiceImpl gsi = new GreetingServiceImpl();
		this.inyectadoPorConstructor = new InyeccionMedianteConstructorController( gsi );
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, inyectadoPorConstructor.sayHello());
	}

}
