package org.sid.service;

import java.util.List;

import org.sid.entities.Cinema;
import org.sid.entities.Salle;

public interface SalleService {
	public List<Object> getSalleName(String name);
	public List<Object> getAllSalle();
	public Salle saveSalle(Salle salle);
	
	public void deleteSalle(Long c);
}
