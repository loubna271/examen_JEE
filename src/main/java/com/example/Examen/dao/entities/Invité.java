package com.example.Examen.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invité extends Participant{

    private String affilattion;
    @OneToMany(mappedBy="invite")
    private Collection<Inscription> inscriptions;

}
