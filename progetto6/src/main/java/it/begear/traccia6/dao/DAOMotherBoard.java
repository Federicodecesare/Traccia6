package it.begear.traccia6.dao;

import java.util.List;
import it.begear.traccia6.model.MotherBoard;

public interface DAOMotherBoard {

	MotherBoard readMotherBoard(int Id);
	List<MotherBoard> readallMotherBoard();
	boolean insertMotherBoard(MotherBoard mb);
	boolean updateMotherBoard(MotherBoard mb);
	List<MotherBoard> readMotherBoardcompatibile(int Id);
	
}
