package com.springLearning.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.springLearning.playground.core.ChocolateBox;
import com.springLearning.playground.core.ChocolateVendingMachine;

@SpringBootApplication
@ImportResource({"classpath:auto_wire.xml", "classpath:other.xml","classpath:autowire_beans.xml","classpath:manual_wire.xml"})
@ComponentScan( basePackages =  {"com.spring.playground"})
public class PlaygroundApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(PlaygroundApplication.class, args);
		System.out.println("-----------------------Context Started--------------------");
		ChocolateVendingMachine cvm = (ChocolateVendingMachine) ctx.getBean("cvm");
		ChocolateVendingMachine cvm3 = (ChocolateVendingMachine) ctx.getBean("changed_cvm");
		ChocolateBox cb  = (ChocolateBox) ctx.getBean("mangobiteBox");
		ChocolateBox cb1 = (ChocolateBox) ctx.getBean("mangobiteBox");
		ChocolateBox cb2 = (ChocolateBox) ctx.getBean("mangobiteBox");
		ChocolateBox cb3 = (ChocolateBox) ctx.getBean("mangobiteBox");
		cvm3.loadChocolates(20);
		cvm3.balance();
		//cvm.getMixChocolates(10);
	}

}
