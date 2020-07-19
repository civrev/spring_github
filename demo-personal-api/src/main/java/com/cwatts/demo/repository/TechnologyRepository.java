package com.cwatts.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cwatts.demo.model.Technology;

public interface TechnologyRepository extends CrudRepository<Technology, Long>{

}
