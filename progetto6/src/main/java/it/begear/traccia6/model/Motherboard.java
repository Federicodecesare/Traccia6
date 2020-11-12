package it.begear.traccia6.model;

public class Motherboard {
	private int id;
	private String produttore;
	private String nome;
	private int ram;
	private int hdd;
	private int ssd;
	private int codiceConfigurazione;
	
	
	
	public Motherboard() {
		super();
	}
	
	
	
	
	public Motherboard(int id, String produttore, String nome, int ram, int hdd, int ssd, int codiceConfigurazione) {
		super();
		this.id = id;
		this.produttore = produttore;
		this.nome = nome;
		this.ram = ram;
		this.hdd = hdd;
		this.ssd = ssd;
		this.codiceConfigurazione = codiceConfigurazione;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public int getCodiceConfigurazione() {
		return codiceConfigurazione;
	}
	public void setCodiceConfigurazione(int codiceConfigurazione) {
		this.codiceConfigurazione = codiceConfigurazione;
	}




	@Override
	public String toString() {
		return "Motherboard [id=" + id + ", produttore=" + produttore + ", nome=" + nome + ", ram=" + ram + ", hdd="
				+ hdd + ", ssd=" + ssd + ", codiceConfigurazione=" + codiceConfigurazione + "]";
	}

	

}
