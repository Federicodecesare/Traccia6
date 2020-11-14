package it.begear.traccia6.dao;

import java.util.List;

import it.begear.traccia6.model.Computer;

public interface DAOComputer {

	boolean createComputer(Computer computer);

	Computer readComputer(int Id);

	boolean updateComputer(Computer computer);

	List<Computer> readAll();

}
