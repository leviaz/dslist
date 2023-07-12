package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

//repository age como serviço de peersistencia atuando diretamente no banco para isso extende do jpa passando a entidade e o id 
public interface GameRepository extends JpaRepository<Game, Long> {

}
