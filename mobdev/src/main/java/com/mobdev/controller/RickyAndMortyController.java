package com.mobdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobdev.model.RickyAndMortyRequest;
import com.mobdev.service.RickyAndMortyService;

@RestController
@RequestMapping("/rickyandmorty")
public class RickyAndMortyController {
	
	 @Autowired 
	 private RickyAndMortyService characterService;


	 @GetMapping("/{id}")
	 public ResponseEntity getCharactersRickmorty(@PathVariable String id) throws Exception{
		 
	 	 return ResponseEntity.ok().body(characterService.request(RickyAndMortyRequest.
				 builder().
				 id(id).
				 build()));
	 }
	



}
