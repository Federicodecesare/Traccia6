package it.begear.traccia6.model;

public class MotherBoard {
	
	private int Id;
	private String Produttore;
	private String Nome;
	private String Ram;
	private String Hdd;
	private String Ssd;
	private int CodConfig;
	private int Quantita;
	private int Prezzo;
	
	public MotherBoard() {
		// TODO Auto-generated constructor stub
	}

	public MotherBoard(String Produttore, String Nome, String Ram, String Hdd, String Ssd, int CodConfig, int Quantita,
			int Prezzo) {
		super();
		this.Produttore = Produttore;
		this.Nome = Nome;
		this.Ram = Ram;
		this.Hdd = Hdd;
		this.Ssd = Ssd;
		this.CodConfig = CodConfig;
		this.Quantita = Quantita;
		this.Prezzo = Prezzo;
	}

	public MotherBoard(int Id, String Produttore, String Nome, String Ram, String Hdd, String Ssd, int CodConfig,
			int Quantita, int Prezzo) {
		super();
		this.Id = Id;
		this.Produttore = Produttore;
		this.Nome = Nome;
		this.Ram = Ram;
		this.Hdd = Hdd;
		this.Ssd = Ssd;
		this.CodConfig = CodConfig;
		this.Quantita = Quantita;
		this.Prezzo = Prezzo;
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

	public String getRam() {
		return Ram;
	}

	public void setRam(String ram) {
		this.Ram = ram;
	}

	public String getHdd() {
		return Hdd;
	}

	public void setHdd(String hdd) {
		this.Hdd = hdd;
	}

	public String getSsd() {
		return Ssd;
	}

	public void setSsd(String ssd) {
		this.Ssd = ssd;
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
		return "MotherBoard [Id=" + Id + ", Produttore=" + Produttore + ", Nome=" + Nome + ", Ram=" + Ram + ", Hdd="
				+ Hdd + ", Ssd=" + Ssd + ", CodConfig=" + CodConfig + ", Quantita=" + Quantita + ", Prezzo=" + Prezzo
				+ "]";
	}
	
	
	
	
	
}
