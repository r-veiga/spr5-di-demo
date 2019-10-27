# spr5-di-demo
Siguiendo el curso de Spring framework 5 de John Thompson. Proyecto demo de las opciones de Inyección de Dependencias en Spring

## Primer commit 
Me limito a crear un Bean que anoto como @Controller en el que creo un método hello()

Y entonces modifico la clase de aplicación para disponer de un contexto de aplicación. 
Lo que hago es aplicar una asignación a AplicationContext sobre la instrucción que originalmente incluye un proyecto con Spring Initializr. 

@SpringBootApplication
public class Spr5DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spr5DiDemoApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}

}

## Segundo commit 
Demuestro los tres tipos de inyección de dependencias: 
1 - constructor 
2 - setter
3 - propiedad

En cada uno de estos casos inyectaré una clase de servicio. 
La clase de servicio dispone de un método greeting() que dice "Hola".
Las clases en las que se inyecta la dependencia emplean el método servicio.greeting() y lo invocarán desde casos de pruebas unitarias creados con JUnit.

Codificaré los tres tipos de inyección en sendas clases del paquete: 
1 - InyeccionMedianteConstructorController
2 - InyeccionMedianteSetterController
3 - InyeccionMediantePropiedadController

En los Controller estoy usando la anotación de Spring @Qualifier en el momento de inyectarles su propiedad 
del tipo GreetingService, de modo que pueda especificar cuál de sus implementaciones emplear.
Este tipo de situaciones, distintas implementaciones, también puede afrontarse con el uso de la anotación @Primary 
en una de las implementaciones para que sea la que se elija por defecto cuando no se explicita @Qualifier, evitando un runtime error.

Sinceramente, se podría exponer los tipos de inyección de dependencias sin usar el framework Spring. 


