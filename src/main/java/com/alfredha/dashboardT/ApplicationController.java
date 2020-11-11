package com.alfredha.dashboardT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alfredha.services.contentServices;
import com.alfredha.services.Entity.Content;

@RestController
public class ApplicationController {
	@Autowired
	contentServices contentServ;
	
	public ApplicationController() {
		// TODO Auto-generated constructor stub
		System.out.println("REST controller Initiallized");
	}
	
	@RequestMapping("/")
	private String index()
	{
		return "{}";
	}

	@GetMapping("/contents")
	private List<Content> getAllContents()
	{
		System.out.println("Enter Get");
		return contentServ.getAllContent();
	}

	@GetMapping("/get-tags")
	private List<String> getTags()
	{	
		return contentServ.getContensTags();
	}
	
	
	@PostMapping("/content-tags")
	private List<Content> getContentWithTag(@RequestBody String jsonTag)
	{	
		return contentServ.getContentByTags(jsonTag);
	}
	
	@PostMapping("/content-upload")
	private int saveContent(@RequestBody Content content)
	{
		System.out.println("Enter post");
		contentServ.saveOrUpate(content);
		return content.getContentId();
	}
	
	
}
