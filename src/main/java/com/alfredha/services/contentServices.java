package com.alfredha.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.alfredha.services.Entity.Content;
import com.alfredha.services.repository.ContentRepository;
import com.google.gson.Gson;

@Service
public class contentServices {
	@Autowired
	ContentRepository contentRepo;
	
	private Gson gson = new Gson();
	
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
	
	public List<Content> getContentByTags(String tagsJson)
	{
		System.out.println(tagsJson);
		String[] tags = gson.fromJson(tagsJson , String[].class);
		
		return contentRepo.findContentWithTag(Arrays.asList(tags));
	}
	
	public List<String> getContensTags()
	{
		return contentRepo.getContentsTagList();
	}
}
