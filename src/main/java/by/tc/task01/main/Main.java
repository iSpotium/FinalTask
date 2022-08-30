package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws ServiceException {

		List<Appliance> appliances = null;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteria = new Criteria(); //

		criteria.add(Oven.HEIGHT.toString(), 40);
		criteria.add(Oven.CAPACITY.toString(), 33);
		criteria.add(Laptop.OS.toString(), "Windows");
		criteria.add(TabletPC.COLOR.toString(), "red");
		
		Criteria criteria2 = new Criteria(); //

		criteria2.add(Laptop.OS.toString(), "Linux");
		criteria2.add(TabletPC.COLOR.toString(), 56);

		Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());

		criteriaRefrigerator.add(Refrigerator.HEIGHT.toString(), 301);
		criteriaRefrigerator.add(Refrigerator.POWER_CONSUMPTION.toString(), 100);
		criteriaRefrigerator.add(Refrigerator.WIDTH.toString(), 80);

		appliances = service.find(criteria);
		PrintApplianceInfo.print(appliances);

		appliances = service.find(criteria2);
		PrintApplianceInfo.print(appliances);
		
		appliances = service.find(criteriaRefrigerator);
		PrintApplianceInfo.print(appliances);

	}
}
