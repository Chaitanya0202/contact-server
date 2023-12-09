package com.personal.contact.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.personal.contact.dto.Viewer;
import com.personal.contact.repo.ViewerRepo;

@Repository
public class ViewerDao {
	@Autowired
	private ViewerRepo repo;
	
	
	public Viewer saveViewer(Viewer viewer) {
		// TODO Auto-generated method stub
		return repo.save(viewer);
	}

}
