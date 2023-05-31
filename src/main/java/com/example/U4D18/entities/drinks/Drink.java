package com.example.U4D18.entities.drinks;

import com.example.U4D18.entities.Consummation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Drink extends Consummation {
	double size;

	public String toString() {
		return this.getName() + " " + this.getSize() + ", prezzo: " + this.getPrice() + "€, calorie:"
				+ this.getCalories();
	}
}
