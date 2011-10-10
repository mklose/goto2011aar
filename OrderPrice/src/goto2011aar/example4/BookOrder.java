package goto2011aar.example4;

import java.util.HashMap;
import java.util.Map;

public class BookOrder {

	private static Map<Integer, BookOrder> bookOrders = new HashMap<Integer, BookOrder>();

	private CustomerStatus customerStatus;
	private boolean isGermany;
	private double shippingCostWorld = 30;
	private double shippingCostGermany = 10;
	private int id;

	public BookOrder() {
	}

	public BookOrder(CustomerStatus customerStatus, String customerLocation) {
		setCustomerStatus(customerStatus);
		setLocation(customerLocation);
		storeOrder();
	}

	public static BookOrder getOrderById(int id) {
		return bookOrders.get(id);
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

	public void setCustomerStatus(CustomerStatus customerStatus) {
		this.customerStatus = customerStatus;
	}

	public void setLocation(String location) {
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
