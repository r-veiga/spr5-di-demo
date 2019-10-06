# spr5-di-demo
Siguiendo el curso de Spring framework 5 de John Thompson. Proyecto demo de las opciones de Inyección de Dependencias en Spring

## Primer commit 
Me limito a crear un Bean que anoto como @Controller en el que creo un método hello()

Y entonces modifico la clase de aplicación: 

@SpringBootApplication
public class Spr5DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spr5DiDemoApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}

}

