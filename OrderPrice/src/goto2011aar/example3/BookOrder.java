package goto2011aar.example3;

import java.util.HashMap;
import java.util.Map;

public class BookOrder {
 
	private CustomerStatus customerStatus;
	private boolean isGermany;
	private double shippingCostWorld = 30;
	private double shippingCostGermany = 10;
	private int id;

	private static Map<Integer, BookOrder> bookOrders = new HashMap<Integer, BookOrder>();

	public static BookOrder getOrderById(int id) {
		return bookOrders.get(id);
	}

	public BookOrder(CustomerStatus customerStatus, String customerLocation) {
		setCustomerStatus(customerStatus);
		setLocation(customerLocation);
		storeOrder();
	}

	private void storeOrder() {
		id = getNextId();
		bookOrders.put(id, this);
	}

	private int getNextId() {
		return bookOrders.size() + 1;
	}

	public double getShippingCostGermany() {
		return shippingCostGermany;
	}

	public double getShippingCostWorld() {
		return shippingCostWorld;
	}

	public int getId() {
		return id;
	}

	private void setCustomerStatus(CustomerStatus customerStatus) {
		this.customerStatus = customerStatus;
	}

	private void setLocation(String location) {
		isGermany = (location.equals("Germany"));
	}

	public double getShippingCost() {
		if (customerStatus.isVip() && isGermany)
			return 0;
		if (isGermany)
			return getShippingCostGermany();
		return getShippingCostWorld();
	}
}
