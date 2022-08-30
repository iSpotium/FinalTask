package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

public class FileApplianceDAOImpl implements ApplianceDAO {

	private final String path = "appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {

		Map<String, Object> savedcriteria = criteria.getCriteria();
		Set<String> savedString = new HashSet();
		ClassLoader loader = FileApplianceDAOImpl.class.getClassLoader();
		File dataFile = new File(loader.getResource(path).getFile());
		String word;
		String line;

		try (BufferedReader reader = new BufferedReader(new FileReader(dataFile))) {
			line = reader.readLine();

			while (line != null) {
				if ((criteria.getGroupSearchName() == null) || (line.contains(criteria.getGroupSearchName()))) {
					for (Map.Entry<String, Object> temp : savedcriteria.entrySet()) {
						word = temp.getKey() + "=" + temp.getValue();
						if (line.contains(word)) {
							savedString.add(line);
						}
					}

				}
				line = reader.readLine();
			}
		} catch (FileNotFoundException ex) {
			throw new DAOException(ex);
		} catch (IOException ex) {
			throw new DAOException(ex);
		}

		return findCriteria(savedString);
	}

	private List<Appliance> findCriteria(Set<String> savedString) {

		DAOFileLogic log = DAOFileLogic.getInstance();
		List<Appliance> criterialAppliance = new ArrayList();
		String[] splitedLine;
		for (String el : savedString) {
			splitedLine = log.splitterString(el);
			String objName;
			objName = splitedLine[0];

			if (objName.equals(Oven.class.getSimpleName())) {
				criterialAppliance.add(log.initializationOven(splitedLine));
			} else if (objName.equals(Laptop.class.getSimpleName())) {
				criterialAppliance.add(log.initializationLaptop(splitedLine));
			} else if (objName.equals(Refrigerator.class.getSimpleName())) {
				criterialAppliance.add(log.initRefrigerator(splitedLine));
			} else if (objName.equals(VacuumCleaner.class.getSimpleName())) {
				criterialAppliance.add(log.initializationVacuumCleaner(splitedLine));
			} else if (objName.equals(TabletPC.class.getSimpleName())) {
				criterialAppliance.add(log.initializationTabletPC(splitedLine));
			} else if (objName.equals(Speakers.class.getSimpleName())) {
				criterialAppliance.add(log.initializationSpeakers(splitedLine));
			}

		}

		return criterialAppliance;
	}
}