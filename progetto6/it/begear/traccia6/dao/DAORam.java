package it.begear.traccia6.dao;

import java.util.List;

import it.begear.traccia6.model.Ram;

public interface DAORam {
	
	void createRam(Ram ram);
	
	Ram  readRam(int Id); 
	
	void updateRam(Ram ram);
	
	List<Ram> readAll();	

}
