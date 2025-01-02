package com.example.Examen.dto;

import lombok.Data;

import java.sql.Time;

@Data
public class ConferenceDto {

    private String id;
    private String titre;
    private Time heuredebut;
    private Time heurefin;
    private String desc;
}
