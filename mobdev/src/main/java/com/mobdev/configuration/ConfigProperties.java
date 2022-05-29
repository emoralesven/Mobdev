package com.mobdev.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ConfigProperties {

	@Value("${url.rickandmorty.character}")
	private String urlCharacter;
	@Value("${url.rickandmorty.location}")
	private String urlLocation;
}
