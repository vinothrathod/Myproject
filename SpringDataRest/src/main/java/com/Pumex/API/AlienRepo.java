package com.Pumex.API;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Pumex.API.model.Alien;


@RepositoryRestResource(collectionResourceRel = "aliens",path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
