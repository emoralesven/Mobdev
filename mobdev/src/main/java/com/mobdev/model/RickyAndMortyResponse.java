package com.mobdev.model;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class RickyAndMortyResponse {
	
	private int id;
	private String name;
	private String status;
	private String species;
	private String type;
	private int episode_count;
	private Origin origin = new Origin();
	
}
