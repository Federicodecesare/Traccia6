package it.begear.traccia6.model;

public class SSD {
private int id ;
private String produttore;
private String nome;
private String capacita;
private int codconfing;
private int quantita;
private int prezzo;
public SSD() {}
public SSD(String produttore, String nome, String capacita, int codconfing, int quantita, int prezzo) {

	this.produttore = produttore;
	this.nome = nome;
	this.capacita = capacita;
	this.codconfing = codconfing;
	this.quantita = quantita;
	this.prezzo = prezzo;
}
public SSD(int id, String produttore, String nome, String capacita, int codconfing, int quantita, int prezzo) {
	super();
	this.id = id;
	this.produttore = produttore;
	this.nome = nome;
	this.capacita = capacita;
	this.codconfing = codconfing;
	this.quantita = quantita;
	this.prezzo = prezzo;
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
public String getCapacita() {
	return capacita;
}
public void setCapacita(String capacita) {
	this.capacita = capacita;
}
public int getCodconfing() {
	return codconfing;
}
public void setCodconfing(int codconfing) {
	this.codconfing = codconfing;
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
	return "SSD [id=" + id + ", produttore=" + produttore + ", nome=" + nome + ", capacita=" + capacita
			+ ", codconfing=" + codconfing + ", quantita=" + quantita + ", prezzo=" + prezzo + "]";
}






}
