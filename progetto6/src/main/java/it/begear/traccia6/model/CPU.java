package it.begear.traccia6.model;

public class CPU {
	private int id;
	private String nome;
	private int codiceconfig;
	private String produttore;
	private String numerocore;
	private String frequenza;
	private int quantita;
	private int prezzo;
	public CPU() {
	}
	public CPU(String nome, int codiceconfig, String produttore, String numerocore, String frequenza,
			int quantita, int prezzo) {

		this.nome = nome;
		this.codiceconfig = codiceconfig;
		this.produttore = produttore;
		this.numerocore = numerocore;
		this.frequenza = frequenza;
		this.quantita = quantita;
		this.prezzo = prezzo;
	}
	
	public CPU(int id, String nome, int codiceconfig, String produttore, String numerocore, String frequenza,
			int quantita, int prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.codiceconfig = codiceconfig;
		this.produttore = produttore;
		this.numerocore = numerocore;
		this.frequenza = frequenza;
		this.quantita = quantita;
		this.prezzo = prezzo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodiceconfig() {
		return codiceconfig;
	}
	public void setCodiceconfig(int codiceconfig) {
		this.codiceconfig = codiceconfig;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	public String getNumerocore() {
		return numerocore;
	}
	public void setNumerocore(String numerocore) {
		this.numerocore = numerocore;
	}
	public String getFrequenza() {
		return frequenza;
	}
	public void setFrequenza(String frequenza) {
		this.frequenza = frequenza;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "CPU [id=" + id + ", nome=" + nome + ", codiceconfig=" + codiceconfig + ", produttore=" + produttore
				+ ", numerocore=" + numerocore + ", frequenza=" + frequenza + ", quantita=" + quantita + ", prezzo="
				+ prezzo + "]";
	}
	
	
}
