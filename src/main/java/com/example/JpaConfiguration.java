package com.example;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by zoe on 28/04/2017.
 */
@Configuration
@EntityScan("com.example.persistence.entities")
@EnableJpaRepositories(value = "com.example.persistence.repositories")
public class JpaConfiguration {
}

