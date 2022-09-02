package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.groups.ConvertGroup;
import javax.validation.groups.Default;

import com.devsuperior.dsdeliver.core.validation.Groups;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	
	@NotNull
	private String address;
	@NotNull
	private Double latitude;
	@NotNull
	private Double longitude;
	private Instant moment;
	private OrderStatus status;
	
	@Valid
	@ConvertGroup(from = Default.class, to = Groups.ProductId.class)
	@NotEmpty
	private List<ProductDTO> products = new ArrayList<>();
	public OrderDTO() {
	}

	public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
		this.id = id;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.moment = moment;
		this.status = status;
	}
	
	public OrderDTO(Order order) {
		id = order.getId();
		address = order.getAddress();
		latitude = order.getLatitude();
		longitude = order.getLatitude();
		moment = order.getMoment();
		status = order.getStatus();
		products = order.getProducts().stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}
	
}
