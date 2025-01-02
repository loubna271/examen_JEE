package com.example.Examen.dao.repositories;

import com.example.Examen.dao.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
