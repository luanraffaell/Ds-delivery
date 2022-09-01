package com.devsuperior.dsdeliver.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	private OrderService productService;
	
	public OrderController(OrderService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll(){
		List<OrderDTO> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}
}
