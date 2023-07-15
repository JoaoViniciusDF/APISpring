package com.meuprojeto.JavaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.JavaSpring.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
