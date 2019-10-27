package guru.springframework.spr5didemo.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.spr5didemo.services.GreetingServiceImpl;

public class InyeccionMedianteSetterControllerTest {

	private InyeccionMedianteSetterController inyectadoPorSetter;
	
	@Before
	public void setUp() throws Exception {
		this.inyectadoPorSetter = new InyeccionMedianteSetterController();
		this.inyectadoPorSetter.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, inyectadoPorSetter.sayHello());
	}

}
