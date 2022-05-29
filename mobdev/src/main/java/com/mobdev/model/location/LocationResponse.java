package com.mobdev.model.location;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class LocationResponse {
	
	private int id;
	private String name;
	private String type;
	private String dimension;
	private List<ResidentsLocation> residents = new  ArrayList<ResidentsLocation>();
	private String url;
	private String created;
		
}
