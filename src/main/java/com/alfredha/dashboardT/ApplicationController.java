package com.alfredha.dashboardT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@GetMapping("/")
	private int basic()
	{
		System.out.println("enter");
		return 0;
	}

	@GetMapping("/content")
	private List<Content> getAllContents()
	{
		System.out.println("Enter Get");
		return contentServ.getAllContent();
	}
	
	@GetMapping("/content-filter")
	private List<Content> getContentWithFilter(@RequestBody String filter)
	{
		return contentServ.getContentByFilter(filter);
	}
	
	@PostMapping("/content")
	private int saveContent(@RequestBody Content content)
	{
		System.out.println("Enter post");
		contentServ.saveOrUpate(content);
		return content.getOntentId();
	}
	
	
}
