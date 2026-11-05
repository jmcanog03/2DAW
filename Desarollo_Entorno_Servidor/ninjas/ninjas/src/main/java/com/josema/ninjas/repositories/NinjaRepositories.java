package com.josema.ninjas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josema.ninjas.entities.Ninja;

@Repository 
public interface NinjaRepositories extends JpaRepository <Ninja,Long> {

}
