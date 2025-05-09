package com.mobisoft.opentelemetry.inventoryservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory-service")
public class InventoryController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(InventoryController.class);
	
	@GetMapping("/product/{productId}")
	public Integer getProductInventory(@PathVariable
	String productId) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			LOGGER.error("Error ",e);
		}
		return 100;
	}
}
