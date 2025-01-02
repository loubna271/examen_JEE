package com.example.Examen.dao.repositories;

import com.example.Examen.dao.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Integer> {
}
