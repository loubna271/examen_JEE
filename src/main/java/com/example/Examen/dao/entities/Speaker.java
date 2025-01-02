package com.example.Examen.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Speaker extends Participant  {

    private String lien;
    @OneToOne
    private Conference conference;
}
