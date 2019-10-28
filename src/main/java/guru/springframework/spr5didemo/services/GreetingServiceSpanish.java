package guru.springframework.spr5didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class GreetingServiceSpanish implements GreetingService {

	@Override
	public String sayGreeting() {
		return "HOLA - Servicio de saludo en español. Está activo el perfilado Spring \"es\"";
	}

}
