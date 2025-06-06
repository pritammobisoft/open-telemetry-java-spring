package com.mobisoft.opentelemetry.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mobisoft.opentelemetry.productservice.model.Product;

@RestController
@RequestMapping("/product-service")
public class ProductController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${inventory.service.url}")
	private String inventoryServiceUrl;

	@GetMapping("/product/{productId}")
	public Product getProduct(@PathVariable
	String productId) {
		Integer response = restTemplate.getForObject(
				inventoryServiceUrl + "product/{productId}", Integer.class,
				productId);
		Product product = new Product();
		product.setStock(response);
		return product;
	}
}
