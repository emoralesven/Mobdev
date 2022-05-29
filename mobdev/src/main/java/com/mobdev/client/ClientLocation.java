package com.mobdev.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mobdev.configuration.ConfigProperties;
import com.mobdev.model.location.LocationResponse;

@Service
public class ClientLocation {

	@Autowired
	ConfigProperties configProperties;
	
	public LocationResponse locationRestTemplate(String id) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity(configProperties.getUrlLocation().concat(id), LocationResponse.class).getBody();
	}
}