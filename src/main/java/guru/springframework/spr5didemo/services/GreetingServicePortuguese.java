package guru.springframework.spr5didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("po")
@Primary
public class GreetingServicePortuguese implements GreetingService {
	
	private String saludo = "OLA - Serviço de saudaçao em português. O perfil Spring \"po\" está ativo";

	@Override
	public String sayGreeting() {
		return saludo;
	}

}
