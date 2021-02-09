package com.atsistemas.dcmacias.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @PersistenceUnit
    EntityManagerFactory emf;

}