package guru.springframework.spr5didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hola - Soy un simple saludo que ha sido inyectado por setter";
	}

}
