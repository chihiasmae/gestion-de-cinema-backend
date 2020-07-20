package org.sid.service;

import java.util.List;

import org.sid.dao.ProjectionRepository;
import org.sid.entities.Projection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@Service
public class ProjectionServiceImp implements ProjectionService{
	@Autowired
	private ProjectionRepository projectionRepository;
	
	@Override
	public List<Projection> getProjectionName(String name) {
		return  projectionRepository.getProjectionName(name);
	}
}
