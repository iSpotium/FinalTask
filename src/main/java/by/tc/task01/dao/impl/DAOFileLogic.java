package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class DAOFileLogic {

	private static final DAOFileLogic instance = new DAOFileLogic();

	private DAOFileLogic() {
	}

	public static DAOFileLogic getInstance() {
		return instance;
	}

//////////////////////////////////////////////////////////////	
	public String[] splitterString(String line) {
		line = line.replace(" : ", ", ");
		String[] splitedLine = line.split(", ");

		return splitedLine;
	}

/////////////////////////////////////////////////////////////
	public Appliance initializationSpeakers(String[] splitedString) {

		Speakers speakersObj = new Speakers();

		String saveValueString;
		int saveValueInt;
		double saveValueDouble;
		String[] splitedWord;

		saveValueString = splitedString[0];
		speakersObj.setName(saveValueString);

		saveValueString = splitedString[1];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		speakersObj.setPowerConsumption(saveValueInt);

		saveValueString = splitedString[2];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		speakersObj.setNumberOfSpeakers(saveValueInt);

		saveValueString = splitedString[3];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		speakersObj.setFrequencyRange(saveValueString);

		saveValueString = splitedString[4];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		speakersObj.setCordLength(saveValueInt);

		return speakersObj;
	}
/////////////////////////////////////////////////////////////

	public Appliance initializationTabletPC(String[] splitedString) {

		TabletPC tabletPCObj = new TabletPC();

		String saveValueString;
		int saveValueInt;
		double saveValueDouble;
		String[] splitedWord;

		saveValueString = splitedString[0];
		tabletPCObj.setName(saveValueString);

		saveValueString = splitedString[1];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueDouble = Double.parseDouble(saveValueString);
		tabletPCObj.setBatteryCapacity(saveValueDouble);

		saveValueString = splitedString[2];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		tabletPCObj.setDisplayInches(saveValueInt);

		saveValueString = splitedString[3];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		tabletPCObj.setMemoryRom(saveValueInt);

		saveValueString = splitedString[4];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		tabletPCObj.setFlashMemoryCapacity(saveValueInt);

		saveValueString = splitedString[5];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		tabletPCObj.setColor(saveValueString);

		return tabletPCObj;
	}
////////////////////////////////////////////////////////////

	public Appliance initializationVacuumCleaner(String[] splitedString) {

		VacuumCleaner vacuumCleanerObj = new VacuumCleaner();

		String saveValueString;
		int saveValueInt;
		double saveValueDouble;
		String[] splitedWord;

		saveValueString = splitedString[0];
		vacuumCleanerObj.setName(saveValueString);

		saveValueString = splitedString[1];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		vacuumCleanerObj.setPowerConsumtion(saveValueInt);

		saveValueString = splitedString[2];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		vacuumCleanerObj.setFilterType(saveValueString);

		saveValueString = splitedString[3];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		vacuumCleanerObj.setBagType(saveValueString);

		saveValueString = splitedString[4];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		vacuumCleanerObj.setWandType(saveValueString);

		saveValueString = splitedString[5];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		vacuumCleanerObj.setMotorSpeedRegulation(saveValueInt);

		saveValueString = splitedString[6];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		vacuumCleanerObj.setCleaningWidth(saveValueInt);

		return vacuumCleanerObj;
	}

///////////////////////////////////////////////////////////////
	public Appliance initializationOven(String[] splitedString) {

		Oven ovenObj = new Oven();

		String saveValueString;
		int saveValueInt;
		double saveValueDouble;

		saveValueString = splitedString[0];
		ovenObj.setName(saveValueString);

		saveValueString = splitedString[1];
		String[] splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		ovenObj.setPowerConsumption(saveValueInt);

		saveValueString = splitedString[2];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		ovenObj.setWeight(saveValueInt);

		saveValueString = splitedString[3];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		ovenObj.setCapacity(saveValueInt);

		saveValueString = splitedString[4];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		ovenObj.setDepth(saveValueInt);

		saveValueString = splitedString[5];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueDouble = Double.parseDouble(saveValueString);
		ovenObj.setHeight(saveValueDouble);

		saveValueString = splitedString[6];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueDouble = Double.parseDouble(saveValueString);
		ovenObj.setWidth(saveValueDouble);

		return ovenObj;
	}

///////////////////////////////////////////////////////////////////
	public Appliance initializationLaptop(String[] splitedString) {

		Laptop laptopObj = new Laptop();

		String savevValueString;
		int saveValueInt;
		double saveValueDouble;

		savevValueString = splitedString[0];
		laptopObj.setName(savevValueString);

		savevValueString = splitedString[1];
		String[] tempVal = savevValueString.split("=");
		savevValueString = tempVal[1];
		saveValueDouble = Double.parseDouble(savevValueString);
		laptopObj.setBatteryCapacity(saveValueDouble);

		savevValueString = splitedString[2];
		tempVal = savevValueString.split("=");
		savevValueString = tempVal[1];
		laptopObj.setOs(savevValueString);

		savevValueString = splitedString[3];
		tempVal = savevValueString.split("=");
		savevValueString = tempVal[1];
		saveValueInt = Integer.parseInt(savevValueString);
		laptopObj.setMemoryRom(saveValueInt);

		savevValueString = splitedString[4];
		tempVal = savevValueString.split("=");
		savevValueString = tempVal[1];
		saveValueInt = Integer.parseInt(savevValueString);
		laptopObj.setSystemMemory(saveValueInt);

		savevValueString = splitedString[5];
		tempVal = savevValueString.split("=");
		savevValueString = tempVal[1];
		saveValueDouble = Double.parseDouble(savevValueString);
		laptopObj.setCpu(saveValueDouble);

		savevValueString = splitedString[6];
		tempVal = savevValueString.split("=");
		savevValueString = tempVal[1];
		saveValueInt = Integer.parseInt(savevValueString);
		laptopObj.setDisplayInches(saveValueInt);

		return laptopObj;
	}

////////////////////////////////////////////////////////////
	public Appliance initRefrigerator(String[] splitedString) {

		Refrigerator refrigeratorObj = new Refrigerator();

		String saveValueString;
		int saveValueInt;
		double saveValueDouble;
		String[] splitedWord;

		saveValueString = splitedString[0];
		refrigeratorObj.setName(saveValueString);

		saveValueString = splitedString[1];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		refrigeratorObj.setPowerConsumtion(saveValueInt);

		saveValueString = splitedString[2];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		refrigeratorObj.setWeight(saveValueInt);

		saveValueString = splitedString[3];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueInt = Integer.parseInt(saveValueString);
		refrigeratorObj.setFreezerCapacity(saveValueInt);

		saveValueString = splitedString[4];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueDouble = Double.parseDouble(saveValueString);
		refrigeratorObj.setOverallCapacity(saveValueDouble);

		saveValueString = splitedString[5];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueDouble = Double.parseDouble(saveValueString);
		refrigeratorObj.setHeight(saveValueDouble);

		saveValueString = splitedString[6];
		splitedWord = saveValueString.split("=");
		saveValueString = splitedWord[1];
		saveValueDouble = Double.parseDouble(saveValueString);
		refrigeratorObj.setWidth(saveValueDouble);

		return refrigeratorObj;
	}

}
