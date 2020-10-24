package com.alfredha.services.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredha.services.Entity.Content;

@Repository
public interface ContentRepository extends CrudRepository<Content, Integer>{
	
}
