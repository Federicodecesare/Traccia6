package it.begear.traccia6.dao;

import java.util.List;

import it.begear.traccia6.model.CPU;

public interface DAOCpu {
CPU readCPU(int id);
List<CPU> readallCPU();

}
