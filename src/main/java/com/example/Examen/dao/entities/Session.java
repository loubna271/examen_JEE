package com.example.Examen.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nom;
    @OneToMany (mappedBy="session")
    private Collection<Conference> conferences;

    @OneToOne(mappedBy="session")
    private Modérateur moderateur;

    @OneToOne(mappedBy="session")
    private Salle salle;

    @OneToMany(mappedBy="session")
    private Collection <Inscription> inscription;

}
