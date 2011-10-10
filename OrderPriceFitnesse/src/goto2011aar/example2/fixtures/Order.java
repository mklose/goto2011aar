package goto2011aar.example2.fixtures;

import goto2011aar.example2.Book;
import goto2011aar.example2.BookOrder;
import goto2011aar.example2.CustomerStatus;
import goto2011aar.example2.fixtures.CustomerStatusConverter;

public class Order {

	{
		fitnesse.slim.Slim.addConverter(CustomerStatus.class,
				new CustomerStatusConverter());
	}

	private BookOrder order = new BookOrder();

	public void withBooksAtPrice(int amount, String title, double price) {
		order.addBooks(amount, new Book(title, price));
	}

	public void customerIs(CustomerStatus customerStatus) {
		order.setCustomerStatus(customerStatus);
	}

	public void shipTo(String location) {
		order.setLocation(location);
	}

	public double price() {
		return order.getPrice();
	}

	public double shippingCost() {
		return order.getShippingCost();
	}

	public double shippingCostGermany() {
		return order.getShippingCostGermany();
	}

	public double shippingCostOutsideGermany() {
		return order.getShippingCostWorld();
	}

}