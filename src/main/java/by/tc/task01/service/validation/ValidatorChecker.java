package by.tc.task01.service.validation;

import java.util.Map;
import java.util.Map.Entry;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class ValidatorChecker {

	public static boolean verificationSpeakers(Criteria criteria) {

		boolean indicator = true;

		for (Map.Entry<String, Object> entryCriteria : criteria.getCriteria().entrySet()) {
			if (entryCriteria.getKey().toString().equals(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString()
					.equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}

			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			}
		}
		return indicator;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean verificationTabletPC(Criteria criteria) {

		boolean indicator = true;

		for (Map.Entry<String, Object> entryCriteria : criteria.getCriteria().entrySet()) {
			if (entryCriteria.getKey().toString().equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}

			} else if (entryCriteria.getKey().toString()
					.equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.TabletPC.COLOR.toString())) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			}
		}

		return indicator;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean verificationVacuumCleaner(Criteria criteria) {

		boolean indicator = true;

		for (Map.Entry<String, Object> entryCriteria : criteria.getCriteria().entrySet()) {
			if (entryCriteria.getKey().toString().equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString())) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.VacuumCleaner.BAG_TYPE.toString())) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}

			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.VacuumCleaner.WAND_TYPE.toString())) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString()
					.equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString()
					.equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			}
		}
		return indicator;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static boolean verificationRefrigerator(Criteria criteria) {
		boolean indicator = true;

		for (Map.Entry<String, Object> entryCriteria : criteria.getCriteria().entrySet()) {
			if (entryCriteria.getKey().toString().equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Refrigerator.WEIGHT.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString()
					.equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}

			} else if (entryCriteria.getKey().toString()
					.equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Refrigerator.HEIGHT.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
					if (indicator == true) {
						double value = Double.parseDouble(entryCriteria.getValue().toString());
						if ((value > 300) && (value <= 0)) {
							indicator = false;
							break;
						}else {
							indicator = true;
						}
					}
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Refrigerator.WIDTH.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
					if (indicator == true) {
						double value = Double.parseDouble(entryCriteria.getValue().toString());
						if ((value > 80) && (value < 35 )) {
							indicator = false;
							break;
						}else {
							indicator = true;
						}
					}
				} else {
					indicator = false;
					break;
				}
			}
		}
		return indicator;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean verificationLaptop(Criteria criteria) {

		boolean indicator = true;

		for (Map.Entry<String, Object> entryCriteria : criteria.getCriteria().entrySet()) {
			if (entryCriteria.getKey().toString().equals(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Laptop.OS.toString())) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}

			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Laptop.CPU.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Laptop.DISPLAY_INCHES.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			}
		}
		return indicator;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean verificationOven(Criteria criteria) {
		boolean indicator = true;

		for (Map.Entry<String, Object> entryCriteria : criteria.getCriteria().entrySet()) {
			if (entryCriteria.getKey().toString().equals(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Oven.WEIGHT.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Oven.CAPACITY.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}

			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Oven.DEPTH.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Oven.HEIGHT.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Oven.DEPTH.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals(SearchCriteria.Oven.WIDTH.toString())) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			}
		}

		return indicator;
	}

	public static boolean verificationWithoutParameters(Criteria criteria) {

		boolean indicator = true;

		for (Map.Entry<String, Object> entryCriteria : criteria.getCriteria().entrySet()) {
			if (entryCriteria.getKey().toString().equals("POWER_CONSUMPTION")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("NUMBER_OF_SPEAKERS")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("FREQUENCY_RANGE")) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}

			} else if (entryCriteria.getKey().toString().equals("CORD_LENGTH")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("BATTERY_CAPACITY")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("DISPLAY_INCHES")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("MEMORY_ROM")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("FLASH_MEMORY_CAPACITY")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("COLOR")) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("FILTER_TYPE")) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("BAG_TYPE")) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("WAND_TYPE")) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				}
			} else if (entryCriteria.getKey().toString().equals("MOTOR_SPEED_REGULATION")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("CLEANING_WIDTH")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("WEIGHT")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("FREEZER_CAPACITY")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				}
			} else if (entryCriteria.getKey().toString().equals("OVERALL_CAPACITY")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("HEIGHT")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
	
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("WIDTH")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("OS")) {
				if (entryCriteria.getValue().getClass() == String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("SYSTEM_MEMORY")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("CPU")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("CAPACITY")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;

				} else {
					indicator = false;
					break;
				}
			} else if (entryCriteria.getKey().toString().equals("DEPTH")) {
				if (entryCriteria.getValue().getClass() != String.class) {
					indicator = true;
				} else {
					indicator = false;
					break;
				}
			}
		}
		return indicator;
	}

}
