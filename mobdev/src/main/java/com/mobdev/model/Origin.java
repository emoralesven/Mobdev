package com.mobdev.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Origin {
	
	private String name;
	private String url;
	private String dimension;
	private List<String> residents;
		
	
}
