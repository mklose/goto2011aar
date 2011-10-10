package goto2011aar.example;

import goto2011aar.example3.BookOrder;
import goto2011aar.example3.CustomerStatus;

import org.concordion.integration.junit3.ConcordionTestCase;

public class OrderTest extends ConcordionTestCase {	
	
	public int createOrderForCustomerFrom(String customerStatus, String customerLocation){
		BookOrder order = new BookOrder(CustomerStatus.fromString(customerStatus),customerLocation);
		return order.getId();
	}
 
	public double shippingCostForIs(int orderId){
		return BookOrder.getOrderById(orderId).getShippingCost();
	}
}
