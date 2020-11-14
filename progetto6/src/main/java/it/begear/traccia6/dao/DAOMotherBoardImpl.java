package it.begear.traccia6.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.traccia6.model.MotherBoard;

public class DAOMotherBoardImpl implements DAOMotherBoard {

	private static DAOMotherBoardImpl instance = null;

	private DAOMotherBoardImpl() {
		// TODO Auto-generated constructor stub
	}

	public static DAOMotherBoardImpl getInstance() {
		if (instance == null) {
			instance = new DAOMotherBoardImpl();
		}
		return instance;
	}
	
	
	@Override
	public MotherBoard readMotherBoard(int Id) {

		String sql = "SELECT * FROM motherboard WHERE Id=?";
		MotherBoard mb = null;
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			mb = new MotherBoard();
			stm.setInt(1, Id);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				mb.setId(rs.getInt("Id"));
				mb.setNome(rs.getString("Nome"));
				mb.setCodConfig(rs.getInt("CodConfig"));
				mb.setProduttore(rs.getString("Produttore"));
				mb.setHdd(rs.getString("Hdd"));
				mb.setSsd(rs.getString("Ssd"));
				mb.setRam(rs.getString("Ram"));
				mb.setQuantita(rs.getInt("Quantita"));
				mb.setPrezzo(rs.getInt("Prezzo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mb;

	}

	@Override
	public List<MotherBoard> readallMotherBoard() {

		String sql = "SELECT * FROM motherboard";
		List<MotherBoard> mb = null;
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			mb = new ArrayList<MotherBoard>();
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				MotherBoard m = new MotherBoard();
				m.setId(rs.getInt("Id"));
				m.setNome(rs.getString("Nome"));
				m.setCodConfig(rs.getInt("CodConfig"));
				m.setProduttore(rs.getString("Produttore"));
				m.setHdd(rs.getString("Hdd"));
				m.setSsd(rs.getString("Ssd"));
				m.setRam(rs.getString("Ram"));
				m.setQuantita(rs.getInt("Quantita"));
				m.setPrezzo(rs.getInt("Prezzo"));
				mb.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mb;

	}

	@Override
	public boolean insertMotherBoard(MotherBoard mb) {

		String sql = "INSERT INTO motherboard(Produttore,Nome,Ram,Hdd,Ssd,Prezzo,CodConfig,Quantita) VALUES (?,?,?,?,?,?,?,?)";
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			stm.setString(1, mb.getProduttore());
			stm.setString(2, mb.getNome());
			stm.setString(3, mb.getRam());
			stm.setString(4, mb.getHdd());
			stm.setString(5, mb.getSsd());
			stm.setInt(6, mb.getPrezzo());
			stm.setInt(7, mb.getCodConfig());
			stm.setInt(8, mb.getQuantita());
			stm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean updateMotherBoard(MotherBoard mb) {

		String sql = "UPDATE motherboard SET Produttore = ?,Nome= ?,Ram= ?,Hdd= ?,Ssd= ?,Prezzo= ?,CodConfig= ?,Quantita= ? WHERE Id=?";
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {

			stm.setString(1, mb.getProduttore());
			stm.setString(2, mb.getNome());
			stm.setString(3, mb.getRam());
			stm.setString(4, mb.getHdd());
			stm.setString(5, mb.getSsd());
			stm.setInt(6, mb.getPrezzo());
			stm.setInt(7, mb.getCodConfig());
			stm.setInt(8, mb.getQuantita());
			stm.execute();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<MotherBoard> readMotherBoardcompatibile(int Id) {

		String sql = "SELECT * FROM motherboard WHERE CodConfig=?";
		List<MotherBoard> mb = null;
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			mb = new ArrayList<MotherBoard>();
			stm.setInt(1, Id);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				MotherBoard m = new MotherBoard();
				m.setId(rs.getInt("Id"));
				m.setNome(rs.getString("Nome"));
				m.setCodConfig(rs.getInt("CodConfig"));
				m.setProduttore(rs.getString("Produttore"));
				m.setHdd(rs.getString("Hdd"));
				m.setSsd(rs.getString("Ssd"));
				m.setRam(rs.getString("Ram"));
				m.setQuantita(rs.getInt("Quantita"));
				m.setPrezzo(rs.getInt("Prezzo"));
				mb.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mb;
	}

}
