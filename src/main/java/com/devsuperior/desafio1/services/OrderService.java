package com.devsuperior.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {

	@Autowired
	ShippingService shippingService;

	public Double total(Order order) {
		Double discount = order.getBasic() * (order.getDiscount() / 100);
		Double shipment = shippingService.shipment(order);

		return (order.getBasic() - discount) + shipment;
	}
}
