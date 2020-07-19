package com.cwatts.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cwatts.demo.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Long>{
}
