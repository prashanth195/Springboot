package com.springLearning.playground.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChocolateBox {
	
	private List<Chocolate> chocolates = new ArrayList<Chocolate>();
  	
	public void loadChocolates(List<Chocolate> chocolates) {
		chocolates.addAll(chocolates);
		
	}
	
	public List<Chocolate> getChocolates(String name, int nos)  {
		List<Chocolate> result  = chocolates
				.stream()
				.filter(ch -> ch.getName() == name)
				.limit(nos)
				.collect(Collectors.toList());
		if(result.size() != nos) {
			throw new RuntimeException("no chocolets");
		}
		return result;
		
	}
	
	public List<Chocolate> getAnyChocolates(int nos) {
		List<Chocolate> result = chocolates
				.stream()
				.limit(nos)
				.collect(Collectors.toList());
		if(result.size() != nos) {
			throw new RuntimeException("no chocolets");
		}
		return result;
		
	}


}
