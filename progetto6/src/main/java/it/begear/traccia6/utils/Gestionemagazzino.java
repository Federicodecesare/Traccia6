package it.begear.traccia6.utils;

import it.begear.traccia6.dao.DAOComputer;
import it.begear.traccia6.dao.DAOComputerImpl;
import it.begear.traccia6.dao.DAOCpu;
import it.begear.traccia6.dao.DAOCpuimpls;
import it.begear.traccia6.dao.DAOHDD;
import it.begear.traccia6.dao.DAOHDDImpl;
import it.begear.traccia6.dao.DAOMotherBoard;
import it.begear.traccia6.dao.DAOMotherBoardImpl;
import it.begear.traccia6.dao.DAORam;
import it.begear.traccia6.dao.DAORamImpl;
import it.begear.traccia6.dao.DAOSsd;
import it.begear.traccia6.dao.DAOSsdimpls;
import it.begear.traccia6.model.CPU;
import it.begear.traccia6.model.Computer;
import it.begear.traccia6.model.HDD;
import it.begear.traccia6.model.MotherBoard;
import it.begear.traccia6.model.Ram;
import it.begear.traccia6.model.SSD;
import it.begear.traccia6.view.Cli;

public class Gestionemagazzino {

	public static void Acquista(int K) {
		switch (K) {
		case 1:
			acquistaCpu();
			break;
		case 2:
			acquistaMadre();
			/*
			 * MotherBoard mb = new
			 * MotherBoard(ScannerClass.inserisciStringa("Inserisci Produttore"),
			 * ScannerClass.inserisciStringa("Inserisci Nome"),
			 * ScannerClass.inserisciStringa("Inserisci Ram"),
			 * ScannerClass.inserisciStringa("Inserisci Hdd"),
			 * ScannerClass.inserisciStringa("Inserisci Ssd"),
			 * ScannerClass.inserisciIntero("Inserisci Codice Configurazione"),
			 * ScannerClass.inserisciIntero("Inserisci la Quantita"),
			 * ScannerClass.inserisciIntero("Inserisci Prezzo")); DAOMotherBoard
			 * daoMotherBoard = DAOMotherBoardImpl.getInstance();
			 * daoMotherBoard.insertMotherBoard(mb);
			 */
			break;
		case 3:
			acquistaRam();
			/*
			 * Ram ram = new Ram(ScannerClass.inserisciStringa("Inserisci Nome"),
			 * ScannerClass.inserisciStringa("Inserisci Produttore"),
			 * ScannerClass.inserisciStringa("Inserisci Capacita"),
			 * ScannerClass.inserisciIntero("Inserisci Codice Configurazione"),
			 * ScannerClass.inserisciIntero("Inserisci la Quantita"),
			 * ScannerClass.inserisciIntero("Inserisci Prezzo")); DAORam daoRam =
			 * DAORamImpl.getInstance(); daoRam.createRam(ram);
			 */
			break;
		case 4:
			acquistaHdd();
			/*
			 * HDD hdd = new HDD(ScannerClass.inserisciStringa("Inserisci Produttore"),
			 * ScannerClass.inserisciStringa("Inserisci Nome"),
			 * ScannerClass.inserisciStringa("Inserisci Capacita"),
			 * ScannerClass.inserisciIntero("Inserisci Codice Configurazione"),
			 * ScannerClass.inserisciIntero("Inserisci la Quantita"),
			 * ScannerClass.inserisciIntero("Inserisci Prezzo")); DAOHDD daoHDD =
			 * DAOHDDImpl.getInstance(); daoHDD.createHDD(hdd);
			 */
			break;
		case 5:
			acquistaSdd();
			/*
			 * SSD ssd = new SSD(ScannerClass.inserisciStringa("Inserisci Produttore"),
			 * ScannerClass.inserisciStringa("Inserisci Nome"),
			 * ScannerClass.inserisciStringa("Inserisci Capacita"),
			 * ScannerClass.inserisciIntero("Inserisci Codice Configurazione"),
			 * ScannerClass.inserisciIntero("Inserisci la Quantita"),
			 * ScannerClass.inserisciIntero("Inserisci Prezzo")); DAOSsd daoSsd =
			 * DAOSsdimpls.getInstance(); daoSsd.insertSsd(ssd);
			 */

			break;
		}

	}

	private static void acquistaSdd() {
		DAOSsd daosdd = DAOSsdimpls.getInstance();
		System.out.println("Selezione l'id dell prodotto che si vuole acquistare");
		stampaSdd();
		int indice = ScannerClass.inserisciIntero("");
		int quant = ScannerClass.inserisciIntero("Selezione la quantita");
		SSD s = daosdd.readSsd(indice);
		prezzoTotale(s.getPrezzo(), quant);
	}

	private static void stampaSdd() {
		DAOSsd daosdd = DAOSsdimpls.getInstance();
		for (SSD s : daosdd.readallSsd()) {
			System.out.println(s);
		}

	}

	private static void acquistaHdd() {
		DAOHDD daohdd = DAOHDDImpl.getInstance();
		System.out.println("Selezione l'id dell prodotto che si vuole acquistare");
		stampaHdd();
		int indice = ScannerClass.inserisciIntero("");
		int quant = ScannerClass.inserisciIntero("Selezione la quantita");
		HDD h = daohdd.readHDD(indice);
		prezzoTotale(h.getPrezzo(), quant);

	}

	private static void stampaHdd() {
		DAOHDD daohdd = DAOHDDImpl.getInstance();
		for (HDD hdd : daohdd.readAllHDD()) {
			System.out.println(hdd);
		}

	}

	private static void acquistaRam() {
		DAORam daoram = DAORamImpl.getInstance();
		System.out.println("Selezione l'id dell prodotto che si vuole acquistare");
		stampaRam();
		int indice = ScannerClass.inserisciIntero("");
		int quant = ScannerClass.inserisciIntero("Selezione la quantita");
		Ram r = daoram.readRam(indice);
		prezzoTotale(r.getPrezzo(), quant);
	}

	private static void stampaRam() {
		DAORam daoram = DAORamImpl.getInstance();
		for (Ram r : daoram.readAll()) {
			System.out.println(r);
		}

	}

	private static void acquistaMadre() {
		DAOMotherBoard daoMotherBoard = DAOMotherBoardImpl.getInstance();
		System.out.println("Selezione l'id dell prodotto che si vuole acquistare");
		stampaMadre();
		int indice = ScannerClass.inserisciIntero("");
		int quant = ScannerClass.inserisciIntero("Selezione la quantita");
		MotherBoard m = daoMotherBoard.readMotherBoard(indice);
		prezzoTotale(m.getPrezzo(), quant);

	}

	private static void stampaMadre() {
		DAOMotherBoard daoMotherBoard = DAOMotherBoardImpl.getInstance();
		for (MotherBoard madre : daoMotherBoard.readallMotherBoard()) {
			System.out.println(madre);

		}
	}

	private static void acquistaCpu() {
		DAOCpu daoCpu = DAOCpuimpls.getInstance();
		System.out.println("Selezione l'id dell prodotto che si vuole acquistare");
		stampaCpu();
		int indice = ScannerClass.inserisciIntero("");
		int quant = ScannerClass.inserisciIntero("Selezione la quantita");
		CPU c = daoCpu.readCPU(indice);
		prezzoTotale(c.getPrezzo(), quant);
		/*
		 * CPU cpu = new CPU(ScannerClass.inserisciStringa("Inserisci Nome"),
		 * ScannerClass.inserisciIntero("Inserisci Codice Configurazione"),
		 * ScannerClass.inserisciStringa("Inserisci Produttore"),
		 * ScannerClass.inserisciStringa("Inserisci Numero Core"),
		 * ScannerClass.inserisciStringa("Inserisci Frequenza Core"),
		 * ScannerClass.inserisciIntero("Inserisci la Quantita"),
		 * ScannerClass.inserisciIntero("Inserisci Prezzo"));
		 * 
		 * daoCpu.insertCpu(cpu);
		 */
	}

	private static void prezzoTotale(int prezzo, int quant) {
		int prezzotot = prezzo * quant;
		System.out.println("Il prezzo totale è: " + prezzotot);
		System.out.println("Confermi l'acquisto?");
		if (ScannerClass.inserisciBool()) {
			System.out.println("Acquisto avvenuto con successo!");
		} else {
			System.out.println("L'acquisto non è andato a buon fine");
		}

	}

	private static void stampaCpu() {
		DAOCpu daoCpu = DAOCpuimpls.getInstance();
		for (CPU cp : daoCpu.readallCPU()) {
			System.out.println(cp);
		}

	}

	public static void assemblaggio() {
		DAOMotherBoard daomother = DAOMotherBoardImpl.getInstance();
		System.out.println("----Assemblamento Computer---");
		System.out.println("Inizia selezionando una scheda Madre");
		stampaMadre();
		int indicem = ScannerClass.inserisciIntero("");
		MotherBoard m = daomother.readMotherBoard(indicem);
		System.out.println("Seleziona una cpu");
		stampaCpu(m.getCodConfig());
		int indicec=ScannerClass.inserisciIntero("");
		System.out.println("Selezione una ram");
		stampaRam(m.getCodConfig());
		int indicer=ScannerClass.inserisciIntero("");
		System.out.println("Vuoi inserire un harddisk?");
		int indiceh=0;
		if(ScannerClass.inserisciBool()) {
			System.out.println("Selezione un HDD");
			stampaHdd(m.getId());
			indiceh=ScannerClass.inserisciIntero("");
		}
		System.out.println("Vuoi inserire un SSD?");
		int indices=0;
		if(ScannerClass.inserisciBool()) {
			System.out.println("Selezione un SDD");
			stampaSdd(m.getId());
			indices=ScannerClass.inserisciIntero("");
		}
		Computer c = new Computer(ScannerClass.inserisciStringa("Inserisci nome case"), indicec, indicem, indicer, indiceh, indices);
		DAOComputer daocomputer =DAOComputerImpl.getInstance();
		daocomputer.createComputer(c);
	}

	private static void stampaCpu(int id) {
		DAOCpu daoCpu = DAOCpuimpls.getInstance();
		for (CPU cp : daoCpu.readCPUcompatibile(id)) {
			System.out.println(cp);
		}
	}
	private static void stampaRam(int id) {
		DAORam daoram = DAORamImpl.getInstance();
		for (Ram r : daoram.readRamcompatibile(id)) {
			System.out.println(r);
		}
	}

	private static void stampaHdd(int id) {
		DAOHDD daohdd = DAOHDDImpl.getInstance();
		for (HDD hdd : daohdd.readHDDcompatibile(id)) {
			System.out.println(hdd);
		}

	}
	private static void stampaSdd(int id) {
		DAOSsd daosdd = DAOSsdimpls.getInstance();
		for (SSD s : daosdd.readSsdcompatibile(id)) {
			System.out.println(s);
		}

	}

	public static void inizializzadb() {
		DAOSsd daossd= DAOSsdimpls.getInstance();
		SSD s= daossd.readSsd(0);
		if(s==null) {
			SSD s1= new SSD(0, "null", "null", "null", 0, 0, 0);
			daossd.insertSsdconid(s1);
		}
		DAOHDD daohdd = DAOHDDImpl.getInstance();
		HDD h=daohdd.readHDD(0);
		if(h==null) {
			HDD h1= new HDD(0, "null", "null", "null", 0, 0, 0);
			daohdd.createHDDconid(h1);
		}
		
	}

	public static void vendita() {
		System.out.println("Selezione un computer da acquistare");
		stampaComputer();
		int indicec=ScannerClass.inserisciIntero("");
		DAOComputer daocomputer= DAOComputerImpl.getInstance();
		Computer c=daocomputer.readComputer(indicec);
		int prezzo=prezzocomputer(c);
		System.out.println("Il prezzo del computer è :"+prezzo);
		System.out.println("Vuoi acquistarlo?");
		if(ScannerClass.inserisciBool()) {
			System.out.println("Computer venduto con successo");
		}else {
			System.out.print("Computer non venduto");
		}
	}

	private static int prezzocomputer(Computer c) {
		int tot=0;
		DAOMotherBoard daomother =DAOMotherBoardImpl.getInstance();
		tot=tot+daomother.readMotherBoard(c.getIDMB()).getPrezzo();
		DAOCpu daoCpu=DAOCpuimpls.getInstance();
		tot=tot+daoCpu.readCPU(c.getIDRAM()).getPrezzo();
		DAORam daoram= DAORamImpl.getInstance();
		tot=tot+daoram.readRam(c.getIDRAM()).getPrezzo();
		DAOHDD daohdd =DAOHDDImpl.getInstance();
		if(c.getIDHDD()!=0) {
			tot=tot+daohdd.readHDD(c.getIDHDD()).getPrezzo();
		}
		DAOSsd daosdd = DAOSsdimpls.getInstance();
		if(c.getIDSSD()!=0) {
			tot=tot+daosdd.readSsd(c.getIDSSD()).getPrezzo();
		}
		return tot;
	}

	private static void stampaComputer() {
		DAOComputer daocomputer= DAOComputerImpl.getInstance();
		for (Computer c : daocomputer.readAll()) {
				System.out.println(c);
		}
		
	}

	public static void Componenti() {
		DAOComputer daocomputer= DAOComputerImpl.getInstance();
		System.out.println("Scegli il computer da modificare");
		stampaComputer();
		Computer c = daocomputer.readComputer(ScannerClass.inserisciIntero(""));
		DAOCpu daocpu = DAOCpuimpls.getInstance();
		CPU cpu = daocpu.readCPU(c.getIDCPU());
		int cod=cpu.getCodiceconfig();
		System.out.println("cosa vuoi cambiare?");
		Cli.optionsBuy();
		int scelta=ScannerClass.inserisciIntero("");
		switch(scelta) {
		case 1 :System.out.println("Scegli il nuovo componente");
				stampaCpu(cod);
				c.setIDCPU(ScannerClass.inserisciIntero(""));
			break;
		case 2:
			System.out.println("Scegli il nuovo componente");
			stampaRam(cod);
			c.setIDRAM(ScannerClass.inserisciIntero(""));
			break;
		case 3:
			System.out.println("Scegli il nuovo componente");
			stampaHdd(cod);
			c.setIDHDD(ScannerClass.inserisciIntero(""));
			break;
		case 4:
			System.out.println("Scegli il nuovo componente");
			stampaSdd(cod);
			c.setIDSSD(ScannerClass.inserisciIntero(""));
			break;
	
		}
		daocomputer.updateComputer(c);
		
	}
}