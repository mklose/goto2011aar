package goto2011aar.example3.fixtures;

import goto2011aar.example3.BookOrder;
import goto2011aar.example3.CustomerStatus;
import goto2011aar.example3.fixtures.CustomerStatusConverter;

public class Order {

	{
		fitnesse.slim.Slim.addConverter(CustomerStatus.class,
				new CustomerStatusConverter());

	}

	public int createOrderForCustomerFrom(CustomerStatus customerStatus,
			String customerLocation) {
		BookOrder order = new BookOrder(customerStatus, customerLocation);
		return order.getId();
	}

	public double shippingCostForIs(int orderId) {
		return BookOrder.getOrderById(orderId).getShippingCost();
	}
}
