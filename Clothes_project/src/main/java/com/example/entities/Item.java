package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ITEM")
public class Item {
	@Id
	private  int id;
	private float price;
	private int quantity;
	private float TotalPrice;
	
	 @ManyToOne
	    @JoinColumn(name = "cloth_id", nullable = false)
	    private Clothes cloth;
	
	





	public Item() {
		super();
	}







	public Item(int id, float price, int quantity, float totalPrice, Clothes cloth) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		TotalPrice = totalPrice;
		this.cloth = cloth;
	}
	
	
	
}

