package it.begear.traccia6.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.begear.traccia6.model.CPU;

public class DAOCpuimpls implements DAOCpu {
	private  static DAOCpuimpls instance=null;
	private DAOCpuimpls() {}
	public static  DAOCpuimpls getInstance() {
		if(instance==null) {
			instance= new DAOCpuimpls();
		}
		return  instance;
	}
	public CPU readCPU(int id) {
		String sql="SELECT * FROM cpu WHERE id=?";
		CPU c=null;
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(sql)){
			 c=new CPU();
			 stm.setInt(1, id);
			 ResultSet rs =stm.executeQuery();
			 while(rs.next()) {
				 c.setId(rs.getInt("Id"));
				 c.setNome(rs.getString("Nome"));
				 c.setCodiceconfig(rs.getInt("CodConfig"));
				 c.setProduttore(rs.getString("Produttore"));
				 c.setNumerocore(rs.getString("NumeroCore"));
				 c.setFrequenza(rs.getString("FrequenzaCore"));
				 c.setQuantita(rs.getInt("Quantita"));
				 c.setPrezzo(rs.getInt("Prezzo"));
			 }
		}catch(SQLException e) {
			
		}catch(Exception e) {
			
		}
		return c;
	}
	public List<CPU> readCPU() {
		String sql="SELECT * FROM cpu";
		List<CPU> cp=null;
		try(PreparedStatement stm=ConnectionManager.getConnection().prepareStatement(sql)){
			 cp=new ArrayList<CPU>();
			 ResultSet rs =stm.executeQuery();
			 while(rs.next()) {
				 CPU c=new CPU();
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
		}catch(SQLException e) {
			
		}catch(Exception e) {
			
		}
		return cp;
	}

}
