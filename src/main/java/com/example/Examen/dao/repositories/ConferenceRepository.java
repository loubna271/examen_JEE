package com.example.Examen.dao.repositories;

import com.example.Examen.dao.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference,Integer > {
     List<Conference> findBySpeakerId(Integer speakerId);
}
