package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data @Entity
@Table(name = "Clothes")
public class Clothes {
	@Id
	@Column(name = "cloth_id")
	private int clothId;
	@Column(name = "collections")
	private String colletions;

//	@OneToMany(mappedBy= "clothes")
//
//	private Item items;
	
}
