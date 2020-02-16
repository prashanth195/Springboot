package com.springLearning.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.springLearning.playground.core.ChocolateVendingMachine;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class PlaygroundApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(PlaygroundApplication.class, args);
		
		ChocolateVendingMachine cvm = (ChocolateVendingMachine) ctx.getBean("cvm");
		
		ChocolateVendingMachine cvm2 = (ChocolateVendingMachine) ctx.getBean("cvm2");

		
		System.out.println(cvm.getBox());
		
		System.out.println(cvm2.getBox());

		
		//	cvm.getMixChocolates(10);
		
		
	}

}
