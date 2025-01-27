package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {

	public Double shipment(Order order) {
		Double shipmentValue = 0.00;
		if(order.getBasic() < 100.00) {
			shipmentValue = 20.00;
		}
		else if(order.getBasic() >= 100.00 && order.getBasic() < 200.00) {
			shipmentValue = 12.00;
		}
		else if(order.getBasic() >= 200.00) {
			shipmentValue = 0.00;
		}
		
		return shipmentValue;
	}
}
