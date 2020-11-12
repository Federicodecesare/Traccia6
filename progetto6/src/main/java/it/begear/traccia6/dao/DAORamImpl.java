package it.begear.traccia6.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import it.begear.traccia6.model.Ram;

public class DAORamImpl implements DAORam{
	
	

	public void createRam(Ram ram) {
		String sql = "INSERT INTO ram(Id, Nome, Produttore, Capacita, CodConfig, Quantita, Prezzo) VALUES (?,?,?,?,?,?,?)";
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			
			stm.setInt(1, ram.getId());
			stm.setString(2, ram.getNome());
			stm.setString(3, ram.getProduttore());
			stm.setString(4, ram.getCapacita());
			stm.setInt(5, ram.getCodConfig());
			stm.setInt(6, ram.getQuantita());
			stm.setInt(7, ram.getPrezzo());
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	

	public Ram readRam(int Id) {
		String sql = "SELECT * FROM ram WHERE Id = ?";
		Ram ram = null;
		
		try(PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			
			ram = new Ram();
			stm.setInt(1, Id);
			ResultSet result = stm.executeQuery();
			
			while (result.next()) {
				
				ram.setId(result.getInt("Id"));
				ram.setNome(result.getString("Nome"));
				ram.setProduttore(result.getString("Produttore"));
				ram.setCapacita(result.getString("Capacita"));
				ram.setCodConfig(result.getInt("CodConfig"));
				ram.setQuantita(result.getInt("Quantita"));
				ram.setPrezzo(result.getInt("Prezzo"));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();			
		}
		
		
		
		return ram;
	}
	
	
	

	public void updateRam(Ram ram) {
		
		
	}
	
	
	

	public List<Ram> readAll() {
		
		return null;
	}

}
