package com.springLearning.playground.core;

public class CBFactory {
	
	public  ChocolateBox getInstance(String cname) {
		return new ChocolateBox(cname);
	}
	

}
