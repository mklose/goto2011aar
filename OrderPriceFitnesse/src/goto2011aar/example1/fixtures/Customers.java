package goto2011aar.example1.fixtures;

import goto2011aar.example1.Customer;
import goto2011aar.example1.CustomerStatus;
import goto2011aar.example1.fixtures.CustomerStatusConverter;

public class Customers {
	{
		fitnesse.slim.Slim.addConverter(CustomerStatus.class,
				new CustomerStatusConverter());
	}
	
	private int id;
	private String name;
	private CustomerStatus status;
	private int locationId;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(CustomerStatus customerStatus) {
		this.status = customerStatus;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public void execute(){
		ShopSetUp.shop.addCustomer(new Customer(id,name,status),locationId);
	}		

}
