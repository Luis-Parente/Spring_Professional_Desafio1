package com.devsuperior.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);

		List<Order> entradas = new ArrayList<>();

		entradas.add(new Order(1034, 150.00, 20.0));
		entradas.add(new Order(2282, 800.00, 10.0));
		entradas.add(new Order(1309, 95.90, 0.0));

		for (Order o : entradas) {
			System.out.println("Pedido código " + o.getCode());
			System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(o)));
		}

	}

}
