package it.begear.traccia6.model;

public class HDD {
	
	private int Id;
	private String Produttore;
	private String Nome;
	private String Capacita;
	private int CodConfig;
	private int Quantita;
	private int Prezzo;
	
	public HDD() {
		// TODO Auto-generated constructor stub
	}

	public HDD(int id, String produttore, String nome, String capacita, int codConfig, int quantita, int prezzo) {
		super();
		this.Id = id;
		this.Produttore = produttore;
		this.Nome = nome;
		this.Capacita = capacita;
		this.CodConfig = codConfig;
		this.Quantita = quantita;
		this.Prezzo = prezzo;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getProduttore() {
		return Produttore;
	}

	public void setProduttore(String produttore) {
		this.Produttore = produttore;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
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
		this.CodConfig = codConfig;
	}

	public int getQuantita() {
		return Quantita;
	}

	public void setQuantita(int quantita) {
		this.Quantita = quantita;
	}

	public int getPrezzo() {
		return Prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.Prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "HDD [Id=" + Id + ", Produttore=" + Produttore + ", Nome=" + Nome + ", Capacita=" + Capacita
				+ ", CodConfig=" + CodConfig + ", Quantita=" + Quantita + ", Prezzo=" + Prezzo + "]";
	}

}
