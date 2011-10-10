package goto2011aar.example4.fixtures;

import goto2011aar.example4.BookOrder;
import goto2011aar.example4.CustomerStatus;

public class Order {

	{
		fitnesse.slim.Slim.addConverter(CustomerStatus.class,
				new CustomerStatusConverter());
	}

	private BookOrder currentOrder = new BookOrder();

	public void setLocation(String location) {
		/*
		 * if location.equals("Germany") location =
		 * LocationDataBuilder.anAdresseInGermany(); else location =
		 * LocationDataBuilder.anAdresseOutsideGermany();
		 */
		currentOrder.setLocation(location);
	}

	public void setCustomerStatus(CustomerStatus customerStatus) {
		currentOrder.setCustomerStatus(customerStatus);
	}

	public double shippingCost() {
		return currentOrder.getShippingCost();
	}
}
