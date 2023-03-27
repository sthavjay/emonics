package com.example.service;
import com.example.entities.Item;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepo;
	
	public Item getItemById(int id) {  // get item using id, and also we can do with name and price as well.
		return itemRepo.findById(id).orElse(null);
	}
	
	public List <Item> getItems() {  // get a list of all items where we dont have to pass arguments.
		return itemRepo.findAll();
	}
	
	
	
	public Item saveItem(Item item) {    //only i item can be save at a time.
		return itemRepo.save(item);
	}
	
	public List <Item> saveItem(List<Item> item) {   //List of item can be saved at a time.
		return itemRepo.saveAll(item);
	}
	
	public Item updateItem(Item item) {
		Item existingItem = itemRepo.findById(item.getId()).orElse(null);
		existingItem.setPrice(item.getPrice());
		
		return itemRepo.save(existingItem);
	}

}
