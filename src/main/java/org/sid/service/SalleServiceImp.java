package org.sid.service;

import java.util.List;

import org.sid.dao.SalleRepository;
import org.sid.entities.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@Service
public class SalleServiceImp implements SalleService{
	@Autowired
	private SalleRepository salleRepository;

	@Override
	public List<Object> getSalleName(String name) {
		return salleRepository.getSalleName(name);
	}

	@Override
	public List<Object> getAllSalle() {
		// TODO Auto-generated method stub
		return salleRepository.getAllSalle();
	}

	@Override
	public Salle saveSalle(Salle salle) {
		// TODO Auto-generated method stub
		return salleRepository.save(salle);
	}

	@Override
	public void deleteSalle(Long c) {
		salleRepository.deleteById(c);
		
	}
}
