package com.example.Examen.service;

import com.example.Examen.Mapper.ConferenceMapper;
import com.example.Examen.dao.entities.Conference;
import com.example.Examen.dao.repositories.ConferenceRepository;
import com.example.Examen.dto.ConferenceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ConferenceService implements IConferenceService {
    @Autowired
    private ConferenceRepository conferenceRepository;
    private ConferenceMapper conferenceMapper;

    public ConferenceDto addConference(ConferenceDto conferenceDto) {
        Conference conference=conferenceMapper.toEntity(conferenceDto);
        conferenceRepository.save(conference);
        return conferenceMapper.toDto(conference);
    }
    public List<ConferenceDto> getAllConferencesBySpeaker(Integer speaker) {
        List<Conference> conferences = conferenceRepository.findBySpeakerId(speaker);// récupère une listede réservation associé à un eployé
        return conferences.stream() // stream pour convertir chaque réservation en entité
                .map(conferenceMapper::toDto) // avec mapper toDto
                .collect(Collectors.toList()); // collecter les résukltats dans une liste
    }

    public List<ConferenceDto> getAllConferences() {
        List<Conference> conferences = conferenceRepository.findAll();
        List <ConferenceDto> conferencesdtos= new ArrayList<>();
        for (Conference reservation : conferences) {
            ConferenceDto dto = conferenceMapper.toDto(reservation);
            conferencesdtos.add(dto);
        }
        return conferencesdtos;
    }
 }
