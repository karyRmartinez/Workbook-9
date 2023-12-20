package com.pluralsight.simplespringweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class NorthWindTradersApplication implements CommandLineRunner {
@Autowired @Qualifier("mysql")
ProductDAO productDAO;
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(NorthWindTradersApplication.class, args);
		ProductDAO productDAO = context.getBean(ProductDAO.class);

		System.out.println(productDAO.getAll());
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
