package com.alfredha.services.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alfredha.services.Entity.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer>{
	
	@Query(value = "SELECT * FROM CONTENT WHERE CONTENT_TAGS =?1", nativeQuery = true)
	List<Content> findContentWithTag(String tags);
}
