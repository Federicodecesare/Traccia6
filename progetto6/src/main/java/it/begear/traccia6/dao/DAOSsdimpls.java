package it.begear.traccia6.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import it.begear.traccia6.model.SSD;

public class DAOSsdimpls implements DAOSsd {
	
	private static DAOSsdimpls instance =null;
	private  DAOSsdimpls() {
	}
	public static DAOSsdimpls getInstance() {
		if(instance==null) {
			instance= new DAOSsdimpls();
		}
		return instance;
	}
	@Override
	public SSD readSsd(int id) {
		String sql="Select * FROM ssd where Id=?";
		SSD s=null;
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			s=new SSD();
			stm.setInt(1, id);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				s.setId(rs.getInt("Id"));
				s.setNome(rs.getString("Nome"));
				s.setCodconfing(rs.getInt("CodConfig"));
				s.setProduttore(rs.getString("Produttore"));
				s.setCapacita(rs.getString("Capacita"));
				s.setQuantita(rs.getInt("Quantita"));
				s.setPrezzo(rs.getInt("Prezzo"));
			}
		}catch (Exception e) {
			
		}
		return s;
	}

	@Override
	public List<SSD> readallSsd() {
		String sql="Select * FROM ssd";
		List<SSD> s1=null;
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			s1=new ArrayList<SSD>();
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				SSD s =new SSD();
				s.setId(rs.getInt("Id"));
				s.setNome(rs.getString("Nome"));
				s.setCodconfing(rs.getInt("CodConfig"));
				s.setProduttore(rs.getString("Produttore"));
				s.setCapacita(rs.getString("Capacita"));
				s.setQuantita(rs.getInt("Quantita"));
				s.setPrezzo(rs.getInt("Prezzo"));
				s1.add(s);
			}
		}catch (Exception e) {
			
		}
		return s1;
	}

	@Override
	public boolean insertSsd(SSD s) {
		String sql="INSERT INTO ssd (Nome,CodConfig,Produttore,Capacita,Quantita,Prezzo) VALUES(?,?,?,?,?,?)";
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			stm.setString(1, s.getNome());
			stm.setInt(2, s.getCodconfing());
			stm.setString(3, s.getProduttore());
			stm.setString(4, s.getCapacita());
			stm.setInt(5, s.getQuantita());
			stm.setInt(6, s.getPrezzo());
			stm.execute();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			
			return false;
		}
	
	}

	@Override
	public boolean updateSsd(SSD s) {
		String sql="UPDATE ssd SET Nome=?,CodConfig=?,Produttore=?,Capacita=?,Quantita=?,Prezzo=? WHERE Id=?";
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)){
			stm.setString(1, s.getNome());
			stm.setInt(2, s.getCodconfing());
			stm.setString(3, s.getProduttore());
			stm.setString(4, s.getCapacita());
			stm.setInt(5, s.getQuantita());
			stm.setInt(6, s.getPrezzo());
			stm.setInt(7, s.getId());
			stm.execute();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			
			return false;
		}

	}

}
