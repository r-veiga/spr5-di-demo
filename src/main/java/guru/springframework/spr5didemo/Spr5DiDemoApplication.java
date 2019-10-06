package guru.springframework.spr5didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.spr5didemo.controllers.MyController;

@SpringBootApplication
public class Spr5DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spr5DiDemoApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}

}
