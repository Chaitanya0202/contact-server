package com.personal.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.contact.dto.Viewer;
import com.personal.contact.service.ViewerService;

@RestController
@CrossOrigin("https://my-portfolio-green-nu.vercel.app/")
public class ViewerController {
	@Autowired
	private ViewerService service;
	
	@PostMapping("/viewer")
	 public Viewer saveViewer(@RequestBody Viewer viewer) {
		 return service.saveViewer(viewer);
	 }

}
