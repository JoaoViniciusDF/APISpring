package com.meuprojeto.JavaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.JavaSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}