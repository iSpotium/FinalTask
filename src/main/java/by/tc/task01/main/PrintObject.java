package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class PrintObject {
	public static void printOven(Object oven) {
		System.out.println("Name: " + ((Appliance) oven).getName() + ", Power Consumtion: "
				+ ((Oven) oven).getPowerConsumption() + ", Weight: " + ((Oven) oven).getWeight() + ", Capacity: "
				+ ((Oven) oven).getCapacity() + ", Depth: " + ((Oven) oven).getDepth() + ", Height: "
				+ ((Oven) oven).getHeight() + ", Width: " + ((Oven) oven).getWidth());
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printLaptop(Object laptop) {
		System.out.println("Name: " + ((Appliance) laptop).getName() + ", Battery capacity: "
				+ ((Laptop) laptop).getBatteryCapacity() + ", Operating system: " + ((Laptop) laptop).getOs()
				+ ", Memory rom: " + ((Laptop) laptop).getMemoryRom() + ", System memory: "
				+ ((Laptop) laptop).getSystemMemory() + ", CPU: " + ((Laptop) laptop).getCpu() + ", Display inches: "
				+ ((Laptop) laptop).getDisplayInches());

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printRefrigerator(Object refrigerator) {
		System.out.println("Name: " + ((Appliance) refrigerator).getName() + ", Power Consumtion: "
				+ ((Refrigerator) refrigerator).getPowerConsumtion() + ", Weight: "
				+ ((Refrigerator) refrigerator).getWeight() + ", Freezer capacity: "
				+ ((Refrigerator) refrigerator).getFreezerCapacity() + ", Overal capacity: "
				+ ((Refrigerator) refrigerator).getOverallCapacity() + ", Height: "
				+ ((Refrigerator) refrigerator).getHeight() + ", Width: " + ((Refrigerator) refrigerator).getWidth());

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printVacuumCleaner(Object vacuumCleaner) {
		System.out.println("Name: " + ((Appliance) vacuumCleaner).getName() + ", Power Consumtion: "
				+ ((VacuumCleaner) vacuumCleaner).getPowerConsumtion() + ", Filter type: "
				+ ((VacuumCleaner) vacuumCleaner).getFilterType() + ", Bag type: "
				+ ((VacuumCleaner) vacuumCleaner).getBagType() + ", Wand type: "
				+ ((VacuumCleaner) vacuumCleaner).getWandType() + ", Motor speed regulation: "
				+ ((VacuumCleaner) vacuumCleaner).getMotorSpeedRegulation() + ", Cleaning width: "
				+ ((VacuumCleaner) vacuumCleaner).getCleaningWidth());

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printTabletPC(Object tabletPC) {
		System.out.println("Name: " + ((Appliance) tabletPC).getName() + ", Battery capacity: "
				+ ((TabletPC) tabletPC).getBatteryCapacity() + ", Display inches: "
				+ ((TabletPC) tabletPC).getDisplayInches() + ", Memory rom: " + ((TabletPC) tabletPC).getMemoryRom()
				+ ", Flash memery capacity: " + ((TabletPC) tabletPC).getFlashMemoryCapacity() + ", Color: "
				+ ((TabletPC) tabletPC).getColor());

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printSpeakers(Object speakers) {
		System.out.println("Name: " + ((Appliance) speakers).getName() + ", Power Consumtion: "
				+ ((Speakers) speakers).getPowerConsumption() + ", Number of speakers: "
				+ ((Speakers) speakers).getNumberOfSpeakers() + ", Frequency range: "
				+ ((Speakers) speakers).getFrequencyRange() + ", Cord lenght: "
				+ ((Speakers) speakers).getCordLength());

	}
}
