package com.example.U4D18.entities.toppings;

import com.example.U4D18.entities.Consummation;

public class HamTopping extends ToppingDecorator {
	public HamTopping(Consummation c) {
		super(c);
		this.name = "Prosciutto";
		this.price = 2.00;
		this.calories = 200;
	}
}
