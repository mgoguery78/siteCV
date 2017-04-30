package com.example;

import com.example.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by zoe on 28/04/2017.
 */
@Configuration
public class siteCVConfiguration {
    @Bean
    public DiverseService diverseService() {
        return new DiverseService();
    }

    @Bean
    public EducationService educationService() {
        return new EducationService();
    }

    @Bean
    public ExperienceService experienceService() {
        return new ExperienceService();
    }

    @Bean
    public LanguagesService languagesService() {
        return new LanguagesService();
    }

    @Bean
    public LocalisationService localisationService() {
        return new LocalisationService();
    }

    @Bean
    public ProgrammingService programmingService() {
        return new ProgrammingService();
    }

    @Bean
    public SchoolService schoolService() {
        return new SchoolService();
    }

    @Bean
    public TaskListService taskListService() {
        return new TaskListService();
    }
}

