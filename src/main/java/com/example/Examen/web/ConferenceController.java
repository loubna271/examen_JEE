package com.example.Examen.web;

import com.example.Examen.dto.ConferenceDto;
import com.example.Examen.service.IConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ConferenceController {

    @Autowired
    private IConferenceService conferenceService;


    @GetMapping("/Conférences")
    public String ListerConférence(Model model) {
        List<ConferenceDto> conferences=conferenceService.getAllConferences();
        model.addAttribute("conferences", conferences);
        return "Conference";
    }

    @GetMapping("/Conférences/{id}")
    public String ListerConférenceBySpeaker(@PathVariable("id") Integer speaker, Model model) {
        List<ConferenceDto> conferences=conferenceService.getAllConferencesBySpeaker(speaker);
        model.addAttribute("conferences", conferences);
        return "ConferenceBySpeaker";
    }

    @PostMapping("/nouvelleConférence")
    public String ajouterConference(@ModelAttribute("conference") ConferenceDto conferenceDto) {
        conferenceService.addConference(conferenceDto);
        return "redirect:/Conférences";
    }

}
