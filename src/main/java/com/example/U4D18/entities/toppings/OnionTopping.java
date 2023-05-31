package com.example.U4D18.entities.toppings;

import com.example.U4D18.entities.Consummation;

public class OnionTopping extends ToppingDecorator {

	public OnionTopping(Consummation c) {
		super(c);
		this.name = "Cipolla";
		this.price = 1.00;
		this.calories = 100;
	}
}
