package com.josema.basededatos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josema.basededatos.entities.Pirata;

public interface pirataRepositories extends JpaRepository<Pirata,Long>{

    
} 
