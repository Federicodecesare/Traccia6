package it.begear.traccia6.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.traccia6.model.Computer;

public class DAOComputerImpl implements DAOComputer{
	
	
	private static DAOComputerImpl instance = null;
	
	
	private DAOComputerImpl() {
		
	} 
	
	public static DAOComputerImpl getInstance() {
		if (instance == null) {
			instance = new DAOComputerImpl();
		}
		return instance;
	}
		
	

	
	@Override
	public boolean createComputer(Computer computer) {
		String sql = "INSERT INTO computer(NomeCase, IDCPU, IDMB, IDRAM, IDHDD,IDSSD) VALUES(?,?,?,?,?,?)";
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			
	
			stm.setString(2, computer.getNomeCase());
			stm.setInt(3, computer.getIDCPU());
			stm.setInt(4, computer.getIDMB());
			stm.setInt(5, computer.getIDRAM());
			stm.setInt(6, computer.getIDHDD());
			stm.setInt(7, computer.getIDSSD());
			stm.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	@Override
	public Computer readComputer(int Id) {
		String sql = "SELECT * FROM computer WHERE Id = ?";
		Computer computer = null;
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			
			computer = new Computer();
			stm.setInt(1, Id);
			ResultSet result = stm.executeQuery();
			
			while(result.next()) {
				
				computer.setId(result.getInt("Id"));
				computer.setNomeCase(result.getString("NomeCase"));
				computer.setIDCPU(result.getInt("IDCPU"));
				computer.setIDMB(result.getInt("IDMB"));
				computer.setIDRAM(result.getInt("IDRAM"));
				computer.setIDHDD(result.getInt("IDHDD"));
				computer.setIDSSD(result.getInt("IDSSD"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return computer;
	}
	
	
	@Override
	public boolean updateComputer(Computer computer) {
		String sql = "UPDATE computer SET NomeCase=?, IDCPU=?, IDMB=?, IDRAM=?, IDHDD=?, IDSSD=?";
		
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			
			stm.setInt(1, computer.getId());
			stm.setString(2, computer.getNomeCase());
			stm.setInt(3, computer.getIDCPU());
			stm.setInt(4, computer.getIDMB());
			stm.setInt(5, computer.getIDRAM());
			stm.setInt(6, computer.getIDHDD());
			stm.setInt(7, computer.getIDSSD());
			stm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	@Override
	public List<Computer> readAll() {
		String sql = "SELECT * FROM computer";
		List<Computer> list  = null ;
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			
			ResultSet result = stm.executeQuery();
			list = new ArrayList<Computer>();
			
			while(result.next()) {
				Computer computer = new Computer();
				
				computer.setId(result.getInt("Id"));
				computer.setNomeCase(result.getString("NomeCase"));
				computer.setIDCPU(result.getInt("IDCPU"));
				computer.setIDMB(result.getInt("IDMB"));
				computer.setIDRAM(result.getInt("IDRAM"));
				computer.setIDHDD(result.getInt("IDHDD"));
				computer.setIDSSD(result.getInt("IDSSD"));
				
				list.add(computer);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	

	
}
