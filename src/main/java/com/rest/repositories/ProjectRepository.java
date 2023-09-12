package com.rest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rest.models.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer>{

}
