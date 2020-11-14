package it.begear.traccia6.dao;

import java.util.List;

import it.begear.traccia6.model.Ram;

public interface DAORam {
	
	boolean createRam(Ram ram);
	
	Ram  readRam(int Id); 
	
	boolean updateRam(Ram ram);
	
	List<Ram> readAll();	
	List<Ram>  readRamcompatibile(int Id); 

}
