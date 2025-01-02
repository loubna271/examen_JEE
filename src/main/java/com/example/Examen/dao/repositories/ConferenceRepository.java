package com.example.Examen.dao.repositories;

import com.example.Examen.dao.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConferenceRepository extends JpaRepository<Conference,Integer > {
     List<Conference> findBySpeakerId(Integer speakerId);
}
