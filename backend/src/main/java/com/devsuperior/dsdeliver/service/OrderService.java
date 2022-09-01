package com.devsuperior.dsdeliver.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {
	private OrderRepository OrderRepository;
	
	public OrderService(OrderRepository OrderRepository) {
		this.OrderRepository = OrderRepository;
	}
	
	@Transactional(readOnly =true)
	public List<OrderDTO> findAll(){
		List<Order> list = OrderRepository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
