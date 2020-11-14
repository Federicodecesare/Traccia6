package it.begear.traccia6.controller;

import java.util.List;

import it.begear.traccia6.dao.DAOComputer;
import it.begear.traccia6.dao.DAOComputerImpl;
import it.begear.traccia6.dao.DAOHDD;
import it.begear.traccia6.dao.DAOHDDImpl;
import it.begear.traccia6.dao.DAORam;
import it.begear.traccia6.dao.DAORamImpl;
import it.begear.traccia6.model.Computer;
import it.begear.traccia6.model.HDD;
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
		// inserire gli altri readAll qui sotto
		
	}

	private static void Acquista() {

		int K = 0;
		System.out.println("Quale componente vuoi aquistare?");

		while (K != 6) {
			Cli.optionsBuy();

			switch (K) {
			case 1:
				// crea cpu
				break;
			case 2:
				// crea mother
				break;
			case 3:
				// crea ram
				break;
			case 4:
			/*	HDD hdd = new HDD(ScannerClass.inserisciStringa(), ScannerClass.inserisciStringa(),
						ScannerClass.inserisciStringa(), ScannerClass.inserisciIntero(), ScannerClass.inserisciIntero(),
						ScannerClass.inserisciIntero());
				DAOHDD daoHDD = DAOHDDImpl.getInstance();*/
			//	daoHDD.createHDD(hdd, true);
				break;
			case 5:
				// crea ssd
				break;

			default:
				break;
			}
		}
	}

}
