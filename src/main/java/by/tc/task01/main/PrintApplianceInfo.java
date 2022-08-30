package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliance) {
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		
		if (appliance == null) {
			PrintError.printNullExcepion();

		} else {

			String nameObject;
			System.out.println(
					"========================================================================================================================================");

			for (Appliance i : appliance) {
				nameObject = i.getClass().getSimpleName();
				switch (nameObject) {
				case ("Oven"):
					PrintObject.printOven(i);
					break;
				case ("Laptop"):
					PrintObject.printLaptop(i);
					break;
				case ("Refrigerator"):
					PrintObject.printRefrigerator(i);
					break;
				case ("VacuumCleaner"):
					PrintObject.printVacuumCleaner(i);
					break;
				case ("TabletPC"):
					PrintObject.printTabletPC(i);
					break;
				case ("Speakers"):
					PrintObject.printSpeakers(i);
					break;
				}
			}
		}
		System.out.println(
				"========================================================================================================================================");
		System.out.println();
	}

}
