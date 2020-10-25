package com.alfredha.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.alfredha.services.Entity.Content;
import com.alfredha.services.repository.ContentRepository;

@Service
public class contentServices {
	@Autowired
	ContentRepository contentRepo;
	
	public List<Content> getAllContent()
	{
		List<Content> contents = new ArrayList<Content>();
		contentRepo.findAll().forEach(content -> contents.add(content));
		return contents;
	}
	
	public Content getContentById(int id)
	{
		return contentRepo.findById(id).get();
	}
	
	public List<Content> getContentByFilter(String filter)
	{
		
		return getAllContent();
	}
	
	public void saveOrUpate(Content content)
	{
		contentRepo.save(content);
	}
	
	public void delete(int id)
	{
		contentRepo.deleteById(id);
	}
	
	public List<Content> getContentByTags(String tag)
	{
		return contentRepo.findContentWithTag(tag);
	}
}
