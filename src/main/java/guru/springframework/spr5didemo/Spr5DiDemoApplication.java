package guru.springframework.spr5didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.spr5didemo.controllers.InyeccionMedianteConstructorController;
import guru.springframework.spr5didemo.controllers.InyeccionMediantePropiedadController;
import guru.springframework.spr5didemo.controllers.InyeccionMedianteSetterController;
import guru.springframework.spr5didemo.controllers.MyController;
import guru.springframework.spr5didemo.controllers.UsingOfProfiledInjectedServicesController;

@SpringBootApplication
public class Spr5DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spr5DiDemoApplication.class, args);
		
		MyController basicController = (MyController) ctx.getBean("myController");
		basicController.hello();
		
		System.out.println(ctx.getBean(InyeccionMediantePropiedadController.class).sayHello());
		System.out.println(ctx.getBean(InyeccionMedianteSetterController.class).sayHello());
		System.out.println(ctx.getBean(InyeccionMedianteConstructorController.class).sayHello());
		
		UsingOfProfiledInjectedServicesController profiled = (UsingOfProfiledInjectedServicesController) ctx.getBean("profiledController");
		System.out.println(profiled.sayHello());
	}

}
