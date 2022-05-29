package com.mobdev.service;

import com.mobdev.model.RickyAndMortyRequest;
import com.mobdev.model.RickyAndMortyResponse;

public interface RickyAndMortyService {

	/**
	 * Este metodo envia la solicitud del servicio para consultar
	 * a traves de un parametro id la informacion del Personaje de rick and Morty
	 * Metodo request
	 * @param @object. El id de un personaje de Rick y Morty
	 * @return RickyAndMortyResponse
	 */
	RickyAndMortyResponse request(RickyAndMortyRequest id) throws Exception;
	
}
