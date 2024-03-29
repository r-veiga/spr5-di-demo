package guru.springframework.spr5didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default") 
@Primary
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Greetings, o earthling. Soy el servicio GREETING primario, @PRIMARY";

	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}
}
