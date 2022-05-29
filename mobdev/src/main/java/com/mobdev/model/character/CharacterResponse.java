package com.mobdev.model.character;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CharacterResponse {
	
	private int id;
	private String name;
	private String status;
	private String species;
	private String type;
	private String gender;
	private OrigenCharacter origin;
	private LocationCharacter location;
	private String image;
	private List<EpisodeCharacter> episode = new ArrayList<EpisodeCharacter>();
	private String url;
	private String created;

		
}
