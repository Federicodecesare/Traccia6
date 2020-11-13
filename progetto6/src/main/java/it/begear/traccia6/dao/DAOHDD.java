package it.begear.traccia6.dao;

import java.util.List;

import it.begear.traccia6.model.HDD;

public interface DAOHDD {

	boolean createHDD(HDD hdd, boolean b);
	HDD readHDD(int Id);
	boolean updateHDD(HDD hdd, boolean b);
	boolean deleteHDD(int Id, boolean b);
	List<HDD> readAllHDD();
	
	
	
	
}
