package guru.springframework.spr5didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles="po")
@Ignore
public class UsingOfProfiledInjectedServicesControllerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void sayHelloTest() {
		
		UsingOfProfiledInjectedServicesController profiled = new UsingOfProfiledInjectedServicesController();
		System.out.println(profiled.sayHello());
		assertEquals(profiled.sayHello(), "OLA - Serviço de saudaçao em português. O perfil Spring \"po\" está ativo");
	}

}
