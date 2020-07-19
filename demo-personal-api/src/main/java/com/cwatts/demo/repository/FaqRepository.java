package com.cwatts.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cwatts.demo.model.Faq;

public interface FaqRepository extends CrudRepository<Faq, Long>{

}
