package com.example.Examen.dao.repositories;

import com.example.Examen.dao.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
