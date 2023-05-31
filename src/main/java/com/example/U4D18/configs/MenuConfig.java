package com.example.U4D18.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.U4D18.entities.Consummation;
import com.example.U4D18.entities.Menu;
import com.example.U4D18.entities.drinks.Coke;
import com.example.U4D18.entities.drinks.Lemonade;
import com.example.U4D18.entities.pizzas.Pizza;
import com.example.U4D18.entities.toppings.HamTopping;
import com.example.U4D18.entities.toppings.OnionTopping;

@Configuration
public class MenuConfig {
	@Bean
	@Scope("prototype")
	Menu getMenu() {
		Menu menu = new Menu();

		menu.getMenuEntries().add(getMargherita());
		menu.getMenuEntries().add(getPizzaProsciutto());
		menu.getMenuEntries().add(getPizzaCipolla());
		menu.getMenuEntries().add(getPizzaProsciuttoCipolla());
		menu.getMenuEntries().add(getCoke());
		menu.getMenuEntries().add(getLemonade());

		return menu;
	}

	@Bean
	@Scope("singleton")
	Consummation getMargherita() {
		return new Pizza();
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaProsciutto() {
		return new HamTopping(new Pizza());
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaCipolla() {
		return new OnionTopping(new Pizza());
	}

	@Bean
	@Scope("prototype")
	Consummation getPizzaProsciuttoCipolla() {
		return new HamTopping(new OnionTopping(new Pizza()));
	}

	@Bean
	@Scope("prototype")
	Consummation getCoke() {
		return new Coke(0.5);
	}

	@Bean
	@Scope("prototype")
	Consummation getLemonade() {
		return new Lemonade(0.5);
	}

}
