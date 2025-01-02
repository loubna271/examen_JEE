package com.example.Examen.Mapper;

import com.example.Examen.dao.entities.Conference;
import com.example.Examen.dto.ConferenceDto;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;
@Component
public class ConferenceMapper {


    private ModelMapper modelMapper;

    public ConferenceDto toDto(Conference conference) {
      return modelMapper.map(conference, ConferenceDto.class);
    }

    public Conference toEntity(ConferenceDto conferenceDto) {
        return modelMapper.map(conferenceDto, Conference.class);
    }
}
