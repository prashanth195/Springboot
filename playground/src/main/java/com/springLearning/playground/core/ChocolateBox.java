package com.springLearning.playground.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChocolateBox {
	
	private List<Chocolate> chocolates = new ArrayList<Chocolate>();
  	
	private String cname;
	
	public ChocolateBox(String chocolateName) {
		System.out.println("Constructed CB " + chocolateName + "sucess");
		this.cname = chocolateName;
		
	}
	

	public void init() {
		System.out.println("init done for" + cname);
		loadChocolate(10);
	}
	
	public void loadChocolate(int nos) {
		for( int i = 0; i < nos ; i++) {
			chocolates.add(new Chocolate(cname, "parle" , 1));
		}
		
	}
	
	public List<Chocolate> getChocolates(String name, int nos)  {
		List<Chocolate> result  = chocolates.stream().filter(ch -> ch.getName() == name).limit(nos).collect(Collectors.toList());
		//List<Chocolate> result  = new ArrayList<Chocolate>();
		if(result.size() != nos) {
			throw new RuntimeException("no chocolets");
		}
		return result;
		
	}
	
	public List<Chocolate> getAnyChocolates(int nos) {
		List<Chocolate> result = chocolates.stream().limit(nos).collect(Collectors.toList());
		//List<Chocolate> result  = new ArrayList<Chocolate>();
		if(result.size() != nos) {
			throw new RuntimeException("no chocolets");
		} else {
			chocolates.removeAll(result);
		}
		return result;
		
	}
	

	public void des() {
		System.out.println("Destroyed succesfully...");
	}
	
	public void printBalance() {
		System.out.println("----------------------------------");
		System.out.println("Name : -" +cname);
		System.out.print("Balance : " + chocolates.size());
		System.out.println("----------------------------------");

		
	}
	
	


}
