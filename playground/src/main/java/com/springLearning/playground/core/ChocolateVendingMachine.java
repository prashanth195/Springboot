package com.springLearning.playground.core;

import java.util.List;

public class ChocolateVendingMachine {
	
	private ChocolateBox box;
	
	private String model;
	
	public ChocolateVendingMachine() {
		System.out.println("Created Successfully CVM");
	}
	
	
		
	public ChocolateVendingMachine(ChocolateBox box) {
			super();
			this.box = box;
			System.out.println("Created Successfully CVM with 1 param");

		}

	
	


public ChocolateVendingMachine(ChocolateBox box, String model) {
		super();
		this.box = box;
		this.model = model;
		System.out.println("Created Successfully CVM with 2 param");

	}



	public ChocolateBox getBox() {
		return box;
	}
//
//	public void setBox(ChocolateBox box) {
//		this.box = box;
//	}
//
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Chocolate> getMixChocolates(int money) {
		int nos = calculatesNoOfChocolates(money);
		return box.getAnyChocolates(nos);
	}

	private int calculatesNoOfChocolates(int money) {
		return money * 2;
	}
	
	@Override
	public String toString() {
		return super.toString() + "MODEL "+ model;
	}

}
