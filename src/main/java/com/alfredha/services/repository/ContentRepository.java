package com.alfredha.services.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alfredha.services.Entity.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer>{
	
	@Query(value = "SELECT c FROM Content c WHERE c.contentTags IN :tags")
	List<Content> findContentWithTag(@Param("tags") Collection<String> tags);
	
	@Query(value = "SELECT DISTINCT c.contentTags FROM Content c")
	List<String> getContentsTagList();
}
