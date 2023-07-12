package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//registrar no sistema, service devolve DTO , autowired injeta o repository no service sempre retornando DTO
@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll(){
		var result = gameRepository.findAll();
		return result;  
	}
}
