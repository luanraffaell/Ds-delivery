package com.devsuperior.dsdeliver.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public OrderDTO insert(@RequestBody OrderDTO dto){
		return productService.insert(dto);
	}
	@PutMapping("/{id}/delivered")
	public OrderDTO setDelivered(@PathVariable Long id){
		OrderDTO dto = productService.setDelivered(id);
		return dto;
	}
	@GetMapping("/{id}")
	public OrderDTO findById(@PathVariable Long id) {
		return productService.findById(id);
	}
}
