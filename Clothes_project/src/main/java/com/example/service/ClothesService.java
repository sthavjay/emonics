package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.ClothesRepo;
import com.example.entities.Clothes;

@Service
public class ClothesService { 
	
	@Autowired
	private ClothesRepo clothesRepo;
	
	
//	public Clothes getClothesById(int id) {
//		return ;
//	}

}
