package com.m5challenge.gamestorecatalog.repository;

import com.m5challenge.gamestorecatalog.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    List<Game> findAllByEsrbRating(String esrbRating);
    List<Game> findAllByStudio(String studio);
    List<Game> findAllByTitle(String title);
}

