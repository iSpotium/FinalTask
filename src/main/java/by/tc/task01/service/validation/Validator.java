package by.tc.task01.service.validation;

import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		String criteriaName = criteria.getGroupSearchName();
		if (criteriaName == null) {
			criteriaName = "";
		}

		boolean flag = false;

		switch (criteriaName) {
		case ("Oven"):
			flag = ValidatorChecker.verificationOven(criteria);
			break;
		case ("Laptop"):
			flag = ValidatorChecker.verificationLaptop(criteria);

			break;
		case ("Refrigerator"):
			flag = ValidatorChecker.verificationRefrigerator(criteria);

			break;
		case ("VacuumCleaner"):
			flag = ValidatorChecker.verificationVacuumCleaner(criteria);

			break;

		case ("TabletPC"):
			flag = ValidatorChecker.verificationTabletPC(criteria);

			break;

		case ("Speakers"):
			flag = ValidatorChecker.verificationSpeakers(criteria);

			break;

		case (""):
			flag = ValidatorChecker.verificationWithoutParameters(criteria);

			break;
		}

		return flag;
	}

}
