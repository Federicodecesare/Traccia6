package it.begear.traccia6.dao;

import java.util.List;

import it.begear.traccia6.model.HDD;

public interface DAOHDD {

	boolean createHDD(HDD hdd);
	HDD readHDD(int Id);
	boolean updateHDD(HDD hdd);
	boolean deleteHDD(int Id);
	List<HDD> readAllHDD();
	List<HDD> readHDDcompatibile(int Id);
	
	
	
}
