package com.example.controllers;

import com.example.persistence.entities.*;
import com.example.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zoe on 30/04/2017.
 */
@RestController
@RequestMapping("/infos")
public class GetInfosController {
    @Autowired
    private DiverseService diverseService;

    @Autowired
    private EducationService educationService;

    @Autowired
    private ExperienceService experienceService;

    @Autowired
    private LanguagesService languagesService;

    @Autowired
    private LocalisationService localisationService;

    @Autowired
    private ProgrammingService programmingService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private TaskListService taskListService;

    @RequestMapping(value = "/diverse", method = RequestMethod.GET)
    public List<Diverse> getDiverseInfos() {
        return diverseService.getAllDiverses();
    }

    @RequestMapping(value = "/education", method = RequestMethod.GET)
    public List<Education> getEducationInfos() {
        return educationService.getAllEducations();
    }

    @RequestMapping(value = "/experience", method = RequestMethod.GET)
    public List<Experience> getExperienceInfos() {
        return experienceService.getAllExperiences();
    }

    @RequestMapping(value = "/languages", method = RequestMethod.GET)
    public List<Languages> getLanguagesInfos() {
        return languagesService.getAllLanguages();
    }

    @RequestMapping(value = "/localisation/{id}", method = RequestMethod.GET)
    public Localisation getLocalisationInfodById(@PathVariable("id") int id) {
        return localisationService.getLocalisationById(id);
    }

    @RequestMapping(value = "/programming", method = RequestMethod.GET)
    public List<Programming> getProgrammingInfos() {
        return programmingService.getAllProgramming();
    }

    @RequestMapping(value = "/school/{id}", method = RequestMethod.GET)
    public School getSchoolInfosById(@PathVariable("id") int id) {
        return schoolService.getSchoolById(id);
    }

    @RequestMapping(value = "/tasks/{experienceId}", method = RequestMethod.GET)
    public List<TaskList> getTaskListInfosByExperienceId(@PathVariable("experienceId") int experienceId) {
        return taskListService.getTaskListForExperience(experienceId);
    }
}
