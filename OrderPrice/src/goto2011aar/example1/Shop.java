package goto2011aar.example1;

import java.util.HashMap;
import java.util.Map;

public class Shop {
	private Map<Integer, Book> books = new HashMap<Integer, Book>();
	private Map<Integer, Location> locations = new HashMap<Integer, Location>();
	private Map<Integer, Customer> customers = new HashMap<Integer, Customer>();
	private Map<Integer, Order> orders = new HashMap<Integer, Order>();

	public void addBook(Book book) {
		books.put(book.getId(), book);
	}

	public void addLocations(Location location) {
		locations.put(location.getId(), location);
	}

	public void addCustomer(Customer customer, int customerLocationId) {
		customer.setLocation(locations.get(customerLocationId));
		customers.put(customer.getId(), customer);
	}

	public void addOrder(Order order, int custumerId) {
		order.setCustomer(customers.get(custumerId));
		orders.put(order.getId(), order);
	}

	public void addPositionToOrder(int orderId, int bookId, int amount) {
		OrderPosition position = new OrderPosition(books.get(bookId), amount);
		getOrder(orderId).addPosition(position);
	}

	public Order getOrder(int orderId) {
		return orders.get(orderId);
	}
}
