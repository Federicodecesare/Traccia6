package it.begear.traccia6.model;

public class Ram {
	
	private int Id;
	private String Nome;
	private String Produttore;
	private String Capacita;
	private int CodConfig;
	private int Quantita;
	private int Prezzo;
	
	
	public Ram() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ram(String nome, String produttore, String capacita, int codConfig, int quantita, int prezzo) {
		
		Nome = nome;
		Produttore = produttore;
		Capacita = capacita;
		CodConfig = codConfig;
		Quantita = quantita;
		Prezzo = prezzo;
	}
	
	public Ram(int id, String nome, String produttore, String capacita, int codConfig, int quantita, int prezzo) {
		super();
		Id = id;
		Nome = nome;
		Produttore = produttore;
		Capacita = capacita;
		CodConfig = codConfig;
		Quantita = quantita;
		Prezzo = prezzo;
	}





	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getProduttore() {
		return Produttore;
	}


	public void setProduttore(String produttore) {
		Produttore = produttore;
	}


	public String getCapacita() {
		return Capacita;
	}


	public void setCapacita(String capacita) {
		this.Capacita = capacita;
	}


	public int getCodConfig() {
		return CodConfig;
	}


	public void setCodConfig(int codConfig) {
		CodConfig = codConfig;
	}


	public int getQuantita() {
		return Quantita;
	}


	public void setQuantita(int quantita) {
		Quantita = quantita;
	}


	public int getPrezzo() {
		return Prezzo;
	}


	public void setPrezzo(int prezzo) {
		Prezzo = prezzo;
	}


	@Override
	public String toString() {
		return "Ram [Id=" + Id + ", Nome=" + Nome + ", Produttore=" + Produttore + ", Capacita=" + Capacita
				+ ", CodConfig=" + CodConfig + ", Quantita=" + Quantita + ", Prezzo=" + Prezzo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
