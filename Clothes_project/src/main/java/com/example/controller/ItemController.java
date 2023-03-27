package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Item;
import com.example.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping("/items")
	public List<Item> findAllItems(){
		return service.getItems();
	}
	
	@GetMapping("/items/{id}")
	public Item findItemById(@PathVariable int id){
		return service.getItemById(id);
	}
	
	
	
	@PostMapping("/additem")
	public Item addItem(@RequestBody Item item) {
		return service.saveItem(item);
	}
	
	@PostMapping("/additems")
	public List<Item>addItems(@RequestBody List<Item> items) {
		return service.saveItem(items);
	}
	
	
	
	
}
