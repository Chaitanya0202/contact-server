package com.personal.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.contact.dao.ViewerDao;
import com.personal.contact.dto.Viewer;
@Service
public class ViewerService {
	@Autowired
	private ViewerDao dao;

	public Viewer saveViewer(Viewer viewer) {
		// TODO Auto-generated method stub
		return dao.saveViewer(viewer);
	}

}
