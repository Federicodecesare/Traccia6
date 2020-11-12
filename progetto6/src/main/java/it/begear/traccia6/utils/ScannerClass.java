package it.begear.traccia6.utils;

import java.util.Scanner;

public class ScannerClass {

	public static int inserisciIntero(String messaggio) {
		int intero=0;
		Scanner scanner= new Scanner(System.in);
		System.out.println(messaggio);
		if(scanner.hasNextInt()) { //controlla se l'elemento inserito è un intero
			intero=scanner.nextInt(); //assegna con nextInt il valore intero
			return intero;
		}
		String flush=scanner.nextLine();
		return inserisciIntero(messaggio); // un metodo che richiama se stesso è detto ricorsivo
	}
	
	
	public static String inserisciStringa(String messaggio) {
		Scanner scanner= new Scanner(System.in);
		String string;
		
		System.out.println(messaggio);
		if(scanner.hasNextLine()) {
			string = scanner.nextLine();
			return string;
		}
		
		String flush=scanner.nextLine();
		return inserisciStringa(messaggio);
	}
	
	
		public static boolean inserisciBool() {
			System.out.println("Inserisci T o F");
			String str= inserisciStringa("inserisci stringa");
			if(str.equalsIgnoreCase("T")) {
				return true;
			}else if(str.equalsIgnoreCase("F")) {
				return false;
			}
			else {
				System.out.println("Valore errato inserisci nuovamente");
				return inserisciBool();
			}
		}
	
		public static double inserisciDouble(String messaggio) {
			double db=0;
			Scanner scanner= new Scanner(System.in);
			System.out.println(messaggio);
			if(scanner.hasNextDouble()) { //controlla se l'elemento inserito è un intero
				db=scanner.nextDouble(); //assegna con nextInt il valore intero
				return db;
			}
			String flush=scanner.nextLine();
			return inserisciDouble(messaggio); // un metodo che richiama se stesso è detto ricorsivo
		}
		
		
		
		
}
