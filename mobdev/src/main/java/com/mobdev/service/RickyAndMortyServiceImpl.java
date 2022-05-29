package com.mobdev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobdev.client.ClientCharacter;
import com.mobdev.client.ClientLocation;
import com.mobdev.model.Origin;
import com.mobdev.model.RickyAndMortyRequest;
import com.mobdev.model.RickyAndMortyResponse;
import com.mobdev.model.character.CharacterResponse;
import com.mobdev.model.location.LocationResponse;

@Service
public class RickyAndMortyServiceImpl implements RickyAndMortyService {
	@Autowired
	private ClientCharacter clientCharacter;

	@Autowired
	private ClientLocation clientLocation;

	@Override
	public RickyAndMortyResponse request(RickyAndMortyRequest id) throws Exception {
		CharacterResponse characterResponse = clientCharacter.characterRestTemplate(id.getId());
		LocationResponse locationResponse = clientLocation.locationRestTemplate(id.getId());
		return mapperRickyAndMorty( characterResponse, locationResponse);

	}

	private RickyAndMortyResponse mapperRickyAndMorty(  CharacterResponse characterResponse, LocationResponse locationResponse) {
		
		return RickyAndMortyResponse.
				builder().
				id(locationResponse.getId()).
				name(characterResponse.getName()).
				status(characterResponse.getStatus()).
				species(characterResponse.getSpecies()).
				type(characterResponse.getType()).
				episode_count(characterResponse.getEpisode().size()).
				origin(Origin.builder().
						name(characterResponse.getOrigin().getName()).
						url(characterResponse.getOrigin().getUrl()).
						dimension(locationResponse.getDimension()).
						residents(mapperResidents(locationResponse)).
						build()).
				build();
	}
	private List<String> mapperResidents(LocationResponse locationResponse) {
		List<String> residentsList = new ArrayList<String>();
		
		locationResponse.getResidents().forEach(resident -> {
			residentsList.add(String.valueOf(resident.getUrlResidents()));
		});
		
		return residentsList;
	}
}
