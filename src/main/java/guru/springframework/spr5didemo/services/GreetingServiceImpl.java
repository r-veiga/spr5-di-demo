package guru.springframework.spr5didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Greetings, o earthling";

	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}

}
