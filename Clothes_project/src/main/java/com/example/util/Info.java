package com.example.util;

import lombok.Data;

@Data
public class Info {
	private String message;
	private MessageType type;
	
	
	public Info(String message, MessageType type) {
		super();
		this.message = message;
		this.type = type;
	}
	

}
