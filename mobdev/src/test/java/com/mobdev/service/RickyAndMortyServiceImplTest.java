package com.mobdev.service;


import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mobdev.client.ClientCharacter;
import com.mobdev.client.ClientLocation;
import com.mobdev.model.RickyAndMortyRequest;
import com.mobdev.model.RickyAndMortyResponse;
import com.mobdev.model.character.CharacterResponse;
import com.mobdev.model.character.EpisodeCharacter;
import com.mobdev.model.character.LocationCharacter;
import com.mobdev.model.character.OrigenCharacter;
import com.mobdev.model.location.LocationResponse;
import com.mobdev.model.location.ResidentsLocation;

public class RickyAndMortyServiceImplTest {

    @InjectMocks
    RickyAndMortyServiceImpl rickyAndMortyService;

    @Mock
    ClientCharacter clientCharacterMock;

    @Mock
    ClientLocation clientLocationMock;

    @SuppressWarnings("deprecation")
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        List<EpisodeCharacter> episodeCharacterList = new ArrayList<EpisodeCharacter>();
        episodeCharacterList.add(EpisodeCharacter.builder().url("https://rickandmortyapi.com/api/episode/1").build());
        when(clientCharacterMock.
                characterRestTemplate("1")).
                thenReturn(CharacterResponse.
                        builder().
                        id(1).
                        name("Rick Sanchez").
                        status("Alive").
                        species("Human").
                        type("").
                        gender("Male").
                        origin(OrigenCharacter.
                                builder().
                                name("Earth (C-137)").
                                url("https://rickandmortyapi.com/api/location/1").
                                build()).
                        location(LocationCharacter.
                                builder().
                                name("Earth (Replacement Dimension)").
                                url("https://rickandmortyapi.com/api/location/20").
                                build()).
                        image("https://rickandmortyapi.com/api/character/avatar/1.jpeg").
                        episode(episodeCharacterList).
                        url("https://rickandmortyapi.com/api/character/1").
                        created("2017-11-04T18:48:46.250Z").
                        build());
        List<ResidentsLocation> residentsLocationList = new ArrayList<>();
        residentsLocationList.add(ResidentsLocation.
                builder().
                urlResidents("https://rickandmortyapi.com/api/character/3").
                build());
        when(clientLocationMock.
                locationRestTemplate("1")).
                thenReturn(LocationResponse.
                        builder().
                        id(1).
                        name("Earth (C-137)").
                        type("Planet").
                        dimension("Dimension C-137").
                        residents(residentsLocationList).
                        url("https://rickandmortyapi.com/api/location/1").
                        created("2017-11-10T12:42:04.162Z").
                        build());
    }

    @Test
    public void validateTest()throws Exception {
        RickyAndMortyResponse rickyAndMortyResponse = rickyAndMortyService.request(RickyAndMortyRequest.builder().id("1").build());
        Assert.assertEquals(rickyAndMortyResponse.getName(),"Rick Sanchez");
        Assert.assertEquals(rickyAndMortyResponse.getOrigin().getResidents().size(),1);
    }



}