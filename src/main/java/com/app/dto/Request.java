package com.app.dto;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Request {
	//"data": [“A”,”1”,”334”,”4”,”R”]
	
	private String[]  alphabets;

	public String[] getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(String[] alphabets) {
		this.alphabets = alphabets;
	}

	@Override
	public String toString() {
		return "Request [alphabets=" + Arrays.toString(alphabets) + "]";
	}
	
	
	
}
