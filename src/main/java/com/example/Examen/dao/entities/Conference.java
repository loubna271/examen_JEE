package com.example.Examen.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "conference")
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private Date date;
    private Time heuredebut;
    private Time heurefin;
    private String desc;
    @ManyToOne
    private Session session;

    @OneToOne(mappedBy="conference")
    private Speaker speaker;
}
