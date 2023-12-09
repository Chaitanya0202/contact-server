package com.personal.contact.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.contact.dto.Viewer;

public interface ViewerRepo extends JpaRepository<Viewer, Integer> {

}
