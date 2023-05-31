package com.example.U4D18;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.example.U4D18.configs.MenuConfig;
import com.example.U4D18.entities.Menu;

@Component
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		System.out.println("CIAO");
		Menu menu = ctx.getBean(Menu.class);

		menu.print();

		ctx.close();

	}

}
