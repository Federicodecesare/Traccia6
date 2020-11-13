package it.begear.traccia6.controller;

import it.begear.traccia6.dao.DAOCpu;
import it.begear.traccia6.dao.DAOCpuimpls;
import it.begear.traccia6.dao.DAOSsd;
import it.begear.traccia6.dao.DAOSsdimpls;
import it.begear.traccia6.model.CPU;
import it.begear.traccia6.model.SSD;

public class Controller {

	public static void main(String[] args) {
		/* DAOCpu daocpu=DAOCpuimpls.getInstance();
		 CPU c= new CPU(1, "test", 1, "test", "test", "test", 0, 1);
		 daocpu.insertCpu(c);
		 CPU c1= new CPU(1,"test", 2, "test2", "test", "test", 0, 1);
		 daocpu.updateCpu(c1);
		 CPU cs=daocpu.readCPU(1);
		System.out.println(cs);
		for (CPU cx : daocpu.readallCPU()) {
			System.out.println(cx);
		
		}*/
		DAOSsd daossd=DAOSsdimpls.getInstance();
		SSD s = new SSD(1, "test", "test", "test", 1, 1, 1);
		daossd.insertSsd(s);
		SSD s1 = new SSD(1, "test", "test2", "test2", 1, 1, 1);
		daossd.updateSsd(s1);
		SSD ss=daossd.readSsd(1);
		for(SSD sd : daossd.readallSsd()) {
				System.out.println(sd);
		}
	}

}
