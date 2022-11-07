package com.m5challenge.gamestorecatalog.repository;

import com.m5challenge.gamestorecatalog.model.Console;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsoleRepository extends JpaRepository<Console, Long> {
    List<Console> findAllByManufacturer(String manufacturer);
}
