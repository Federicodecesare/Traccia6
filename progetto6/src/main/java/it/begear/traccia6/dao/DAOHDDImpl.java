package it.begear.traccia6.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import it.begear.traccia6.model.HDD;

public class DAOHDDImpl implements DAOHDD {

	private static DAOHDDImpl instance = null;

	private DAOHDDImpl() {
		// TODO Auto-generated constructor stub
	}

	public static DAOHDDImpl getInstance() {
		if (instance == null) {
			instance = new DAOHDDImpl();
		}
		return instance;
	}

	public boolean createHDD(HDD hdd) {

		String sql = "INSERT INTO hdd(Id,Produttore,Nome,Capacita,CodConfig,Quantita,Prezzo) VALUES (?,?,?,?,?,?,?)";

		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {

			stm.getConnection().setAutoCommit(false);
			stm.setInt(1, hdd.getId());
			stm.setString(2, hdd.getProduttore());
			stm.setString(3, hdd.getNome());
			stm.setString(4, hdd.getCapacita());
			stm.setInt(5, hdd.getCodConfig());
			stm.setInt(6, hdd.getQuantita());
			stm.setInt(7, hdd.getPrezzo());
			stm.execute();
			stm.getConnection().commit();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public HDD readHDD(int Id) {

		String sql = "SELECT * FROM hdd WHERE Id=?";
		HDD hdd = null;

		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {
			hdd = new HDD();
			stm.setInt(1, Id);
			ResultSet result = stm.executeQuery();

			while (result.next()) {

				hdd.setId(result.getInt("Id"));
				hdd.setProduttore(result.getString("Produttore"));
				hdd.setNome(result.getString("Nome"));
				hdd.setCapacita(result.getString("Capacita"));
				hdd.setCodConfig(result.getInt("CodConfig"));
				hdd.setQuantita(result.getInt("Quantita"));
				hdd.setPrezzo(result.getInt("Prezzo"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return hdd;

	}

	public boolean updateHDD(HDD hdd) {

		String sql = "UPDATE hdd SET Prezzo=? WHERE Id=?";
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {

			stm.setInt(1, hdd.getPrezzo());
			stm.setInt(2, hdd.getId());

			stm.execute();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 

	}

	public boolean deleteHDD(int Id) {

		String sql = "DELETE FROM hdd WHERE Id=?";
		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {

			stm.setInt(1, Id);
			stm.execute();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<HDD> readAllHDD() {

		String sql = "SELECT * FROM hdd";
		List<HDD> list = null;
		HDD hdd = null;

		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {

			list = new ArrayList<HDD>();

			ResultSet result = stm.executeQuery();

			while (result.next()) {
				hdd = new HDD();

				hdd.setId(result.getInt("Id"));
				hdd.setProduttore(result.getString("Produttore"));
				hdd.setNome(result.getString("Nome"));
				hdd.setCapacita(result.getString("Capacita"));
				hdd.setCodConfig(result.getInt("CodConfig"));
				hdd.setQuantita(result.getInt("Quantita"));
				hdd.setPrezzo(result.getInt("Prezzo"));

				list.add(hdd);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public List<HDD> readHDDcompatibile(int Id) {
		String sql = "SELECT * FROM hdd WHERE CodConfig=?";
		HDD hdd = null;
		List<HDD> list = null;

		try (PreparedStatement stm = ConnectionManager.getConnection().prepareStatement(sql)) {

			list = new ArrayList<HDD>();
			stm.setInt(1, Id);
			ResultSet result = stm.executeQuery();

			while (result.next()) {
				hdd = new HDD();

				hdd.setId(result.getInt("Id"));
				hdd.setProduttore(result.getString("Produttore"));
				hdd.setNome(result.getString("Nome"));
				hdd.setCapacita(result.getString("Capacita"));
				hdd.setCodConfig(result.getInt("CodConfig"));
				hdd.setQuantita(result.getInt("Quantita"));
				hdd.setPrezzo(result.getInt("Prezzo"));

				list.add(hdd);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
