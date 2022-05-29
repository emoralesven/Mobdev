package com.mobdev.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.mobdev.configuration.ConfigProperties;
import com.mobdev.model.character.CharacterResponse;

@Service
public class ClientCharacter {

	@Autowired
	ConfigProperties configProperties;
	RestTemplate restTemplate = new RestTemplate();



	/**
	 * Este metodo es el cliente creado para consumir el servicio de Character de Rick and Morty
	 * pasandole por parametro el id del personaje usando RestTemplate
	 * Metodo RestTemplate
	 * @String id es el id de un personaje de Rick y Morty
	 * @return restTemplate
	 */
	public CharacterResponse characterRestTemplate(String id) {
		try{
			return restTemplate.getForEntity(configProperties.getUrlCharacter().concat(id), CharacterResponse.class).getBody();
		}catch (HttpClientErrorException ex){
			throw new ResponseStatusException(
					HttpStatus.NOT_FOUND, "entity not found"
			);
		}
	}

}
