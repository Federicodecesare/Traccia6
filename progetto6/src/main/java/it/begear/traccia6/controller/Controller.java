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
import it.begear.traccia6.utils.Gestionemagazzino;
import it.begear.traccia6.utils.ScannerClass;
import it.begear.traccia6.view.Cli;

public class Controller {

	public static void main(String[] args) {
		Gestionemagazzino.inizializzadb();

		int K = 0;
		while (K != 6) {

			Cli.options();
			K = ScannerClass.inserisciIntero("");
			switch (K) {
			case 1:
				// assemblare pc
				Gestionemagazzino.assemblaggio();
				break;
			case 2:
				Gestionemagazzino.Componenti();
				break;
			case 3:
				// acquista nuovi prodotti pc -- finito
				Acquista();
				break;
			case 4:
				Gestionemagazzino.vendita();
				break;
			case 5:
				// visualizzare -- finito
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

		int k = 0;
		System.out.println("Quale componente vuoi aquistare?");

		do  {
			Cli.optionsBuy();
			k=ScannerClass.inserisciIntero("");
			Gestionemagazzino.Acquista(k);
		}while (k != 6);
	}


}
