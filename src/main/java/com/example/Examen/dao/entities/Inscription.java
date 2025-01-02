package com.example.Examen.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Inscription {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    private Date date;
    private typestatut statut;
    private enum typestatut {
        En_cours,Validée,Annulée
    }
    private int prix;
    @ManyToOne
    private Invité invite;

    @ManyToOne
    private Session session;
}
