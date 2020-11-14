package it.begear.traccia6.model;


public class Computer {
	
	private int Id;
	private String NomeCase;
	private int IDCPU;
	private int IDMB;
	private int IDRAM;
	private int IDHDD;
	private int IDSSD;
	
	
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Computer(int id, String nomeCase, int iDCPU, int iDMB, int iDRAM, int iDHDD, int iDSSD) {
		super();
		Id = id;
		NomeCase = nomeCase;
		IDCPU = iDCPU;
		IDMB = iDMB;
		IDRAM = iDRAM;
		IDHDD = iDHDD;
		IDSSD = iDSSD;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNomeCase() {
		return NomeCase;
	}


	public void setNomeCase(String nomeCase) {
		NomeCase = nomeCase;
	}


	public int getIDCPU() {
		return IDCPU;
	}


	public void setIDCPU(int iDCPU) {
		IDCPU = iDCPU;
	}


	public int getIDMB() {
		return IDMB;
	}


	public void setIDMB(int iDMB) {
		IDMB = iDMB;
	}


	public int getIDRAM() {
		return IDRAM;
	}


	public void setIDRAM(int iDRAM) {
		IDRAM = iDRAM;
	}


	public int getIDHDD() {
		return IDHDD;
	}


	public void setIDHDD(int iDHDD) {
		IDHDD = iDHDD;
	}


	public int getIDSSD() {
		return IDSSD;
	}


	public void setIDSSD(int iDSSD) {
		IDSSD = iDSSD;
	}


	@Override
	public String toString() {
		return "Computer [Id=" + Id + ", NomeCase=" + NomeCase + ", IDCPU=" + IDCPU + ", IDMB=" + IDMB + ", IDRAM="
				+ IDRAM + ", IDHDD=" + IDHDD + ", IDSSD=" + IDSSD + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
