package it.begear.traccia6.controller;

import java.util.List;

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
import it.begear.traccia6.utils.ScannerClass;
import it.begear.traccia6.view.Cli;

public class Controller {

	public static void main(String[] args) {
		

		int K = 0;
		while (K != 6) {

			Cli.options();
			K = ScannerClass.inserisciIntero("");
			switch (K) {
			case 1:
				// assemblare pc
				break;
			case 2:
				// modifica componenti del pc
				break;
			case 3:
				// acquista nuovi prodotti pc
				Acquista();
				break;
			case 4:
				// Vendere pc
				break;
			case 5:
				// visualizzare
				VisualizzaMagazzino();
				break;

			default:
				break;
			}

		}

	}

	private static void VisualizzaMagazzino() {

		DAOHDD daoHDD = DAOHDDImpl.getInstance();
		List<HDD> hddMagazzino = daoHDD.readAllHDD();
		for (HDD hdd : hddMagazzino) {
			System.out.println(hdd);
		}

		DAOCpu daoCpu = DAOCpuimpls.getInstance();
		List<CPU> cpuMagazzino = daoCpu.readallCPU();
		for (CPU cpu : cpuMagazzino) {
			System.out.println(cpu);
		}

		DAOMotherBoard daoMotherBoard = DAOMotherBoardImpl.getInstance();
		List<MotherBoard> mbMagazzino = daoMotherBoard.readallMotherBoard();
		for (MotherBoard motherBoard : mbMagazzino) {
			System.out.println(motherBoard);
		}

		DAORam daoRam = DAORamImpl.getInstance();
		List<Ram> ramMagazzino = daoRam.readAll();
		for (Ram ram : ramMagazzino) {
			System.out.println(ram);
		}

		DAOSsd daoSsd = DAOSsdimpls.getInstance();
		List<SSD> ssdMagazzino = daoSsd.readallSsd();
		for (SSD ssd : ssdMagazzino) {
			System.out.println(ssd);
		}

	}

	private static void Acquista() {

		int K = 0;
		System.out.println("Quale componente vuoi aquistare?");

		while (K != 6) {
			Cli.optionsBuy();

			switch (K) {
			case 1:
				CPU cpu = new CPU(ScannerClass.inserisciStringa("Inserisci Nome"), 
								ScannerClass.inserisciIntero("Inserisci Codice Configurazione"), 
								ScannerClass.inserisciStringa("Inserisci Produttore"), 
								ScannerClass.inserisciStringa("Inserisci Numero Core"), 
								ScannerClass.inserisciStringa("Inserisci Frequenza Core"), 
								ScannerClass.inserisciIntero("Inserisci la Quantita"), 
								ScannerClass.inserisciIntero("Inserisci Prezzo"));
				DAOCpu daoCpu = DAOCpuimpls.getInstance();
				daoCpu.insertCpu(cpu);
				break;
			case 2:
				MotherBoard mb = new MotherBoard(ScannerClass.inserisciStringa("Inserisci Produttore"), 
						ScannerClass.inserisciStringa("Inserisci Nome"), 
						ScannerClass.inserisciStringa("Inserisci Ram"), 
						ScannerClass.inserisciStringa("Inserisci Hdd"), 
						ScannerClass.inserisciStringa("Inserisci Ssd"), 
						ScannerClass.inserisciIntero("Inserisci Codice Configurazione"), 
						ScannerClass.inserisciIntero("Inserisci la Quantita"), 
						ScannerClass.inserisciIntero("Inserisci Prezzo"));
				DAOMotherBoard daoMotherBoard = DAOMotherBoardImpl.getInstance();
				daoMotherBoard.insertMotherBoard(mb);
				break;
			case 3:
				Ram ram = new Ram(ScannerClass.inserisciStringa("Inserisci Nome"), 
						ScannerClass.inserisciStringa("Inserisci Produttore"), 
						ScannerClass.inserisciStringa("Inserisci Capacita"), 
						ScannerClass.inserisciIntero("Inserisci Codice Configurazione"), 
						ScannerClass.inserisciIntero("Inserisci la Quantita"), 
						ScannerClass.inserisciIntero("Inserisci Prezzo"));
				DAORam daoRam = DAORamImpl.getInstance();
				daoRam.createRam(ram);
				break;
			case 4:
				HDD hdd = new HDD(ScannerClass.inserisciStringa("Inserisci Produttore"),
						ScannerClass.inserisciStringa("Inserisci Nome"),
						ScannerClass.inserisciStringa("Inserisci Capacita"),
						ScannerClass.inserisciIntero("Inserisci Codice Configurazione"),
						ScannerClass.inserisciIntero("Inserisci la Quantita"),
						ScannerClass.inserisciIntero("Inserisci Prezzo"));
				DAOHDD daoHDD = DAOHDDImpl.getInstance();
				daoHDD.createHDD(hdd);
				break;
			case 5:
				SSD ssd = new SSD(ScannerClass.inserisciStringa("Inserisci Produttore"), 
						ScannerClass.inserisciStringa("Inserisci Nome"), 
						ScannerClass.inserisciStringa("Inserisci Capacita"), 
						ScannerClass.inserisciIntero("Inserisci Codice Configurazione"), 
						ScannerClass.inserisciIntero("Inserisci la Quantita"), 
						ScannerClass.inserisciIntero("Inserisci Prezzo"));
				DAOSsd daoSsd = DAOSsdimpls.getInstance();
				daoSsd.insertSsd(ssd);
				
				break;

			default:
				break;
			}
		}
	}


}
