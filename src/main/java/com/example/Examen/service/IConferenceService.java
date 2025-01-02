package com.example.Examen.service;

import com.example.Examen.dto.ConferenceDto;

import java.util.List;

public interface IConferenceService {
     List<ConferenceDto> getAllConferencesBySpeaker(Integer speaker);
    ConferenceDto addConference(ConferenceDto conferenceDto);
    List<ConferenceDto> getAllConferences();
}
