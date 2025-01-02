package com.example.Examen.dao.repositories;

import com.example.Examen.dao.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionReposirory extends JpaRepository<Session, Integer> {
}
