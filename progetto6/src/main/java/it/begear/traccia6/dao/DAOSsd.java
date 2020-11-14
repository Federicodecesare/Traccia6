package it.begear.traccia6.dao;

import java.util.List;

import it.begear.traccia6.model.SSD;

public interface DAOSsd {
SSD readSsd(int id);
List<SSD> readallSsd();
boolean insertSsd(SSD s);
boolean updateSsd(SSD s);
List<SSD> readSsdcompatibile(int id);
}
