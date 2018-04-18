package guru.springframework;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.HelloController;

@SpringBootApplication
public class SpringbootUsingFactoryBeanApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootUsingFactoryBeanApplication.class, args);		
		
		HelloController helloCtr = (HelloController)ctx.getBean(HelloController.class);
		
		System.out.println("\n" + helloCtr.sayHello());
			

	}
}
