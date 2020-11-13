package it.begear.traccia6.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.traccia6.model.CPU;

public class DAOCpuimpls implements DAOCpu {
	private static DAOCpuimpls instance = null;

	private DAOCpuimpls() {
	}

	public static DAOCpuimpls getInstance() {
		if (instance == null) {
			instance = new DAOCpuimpls();
		}
		return instance;
	}

	public CPU readCPU(int id) {
		String sql = "SELECT * FROM cpu WHERE id=?";
		CPU c = null;
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			c = new CPU();
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				c.setId(rs.getInt("Id"));
				c.setNome(rs.getString("Nome"));
				c.setCodiceconfig(rs.getInt("CodConfig"));
				c.setProduttore(rs.getString("Produttore"));
				c.setNumerocore(rs.getString("NumeroCore"));
				c.setFrequenza(rs.getString("FrequenzaCore"));
				c.setQuantita(rs.getInt("Quantita"));
				c.setPrezzo(rs.getInt("Prezzo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	public List<CPU> readallCPU() {
		String sql = "SELECT * FROM cpu";
		List<CPU> cp = null;
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			cp = new ArrayList<CPU>();
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				CPU c = new CPU();
				c.setId(rs.getInt("Id"));
				c.setNome(rs.getString("Nome"));
				c.setCodiceconfig(rs.getInt("CodConfig"));
				c.setProduttore(rs.getString("Produttore"));
				c.setNumerocore(rs.getString("NumeroCore"));
				c.setFrequenza(rs.getString("FrequenzaCore"));
				c.setQuantita(rs.getInt("Quantita"));
				c.setPrezzo(rs.getInt("Prezzo"));
				cp.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cp;
	}

	@Override
	public boolean insertCpu(CPU c) {
		String sql = "INSERT INTO cpu(Nome,NumeroCore,FrequenzaCore,CodConfig,Prezzo,Quantita,Produttore) VALUES (?,?,?,?,?,?,?)";
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			stm.setString(1, c.getNome());
			stm.setString(2, c.getNumerocore());
			stm.setString(3, c.getFrequenza());
			stm.setInt(4, c.getCodiceconfig());
			stm.setInt(5, c.getPrezzo());
			stm.setInt(6, c.getQuantita());
			stm.setString(7, c.getProduttore());
			stm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCpu(CPU c) {
		String sql = "UPDATE cpu SET Nome=?,NumeroCore=?,FrequenzaCore=?,CodConfig=?,Prezzo=?,Quantita=?,Produttore=? WHERE id=?";
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			
		
		stm.setString(1, c.getNome());
		stm.setString(2, c.getNumerocore());
		stm.setString(3, c.getFrequenza());
		stm.setInt(4, c.getCodiceconfig());
		stm.setInt(5, c.getPrezzo());
		stm.setInt(6, c.getQuantita());
		stm.setString(7, c.getProduttore());
		stm.setInt(8, c.getId());
		stm.execute();
		return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	
	}

}
