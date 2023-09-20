package com.sms;

import lombok.Data;

@Data
public class SmsPojo {

	private String to;
    private String message;

	public void setMessage(String message) {
		this.message = message;
	}
 
}