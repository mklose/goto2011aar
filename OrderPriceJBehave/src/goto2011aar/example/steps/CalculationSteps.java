package goto2011aar.example.steps;

import goto2011aar.example3.BookOrder;
import goto2011aar.example3.CustomerStatus;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
public class CalculationSteps {
		
	private String customerLocation;
	private CustomerStatus customerStatus;
	
	@Given("an order to $customerLocation")
	public void anOrderTo(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	
	@When("the customer is a $customerStatus")
	public void theCustomerIsA(String customerStatus) {
		this.customerStatus = CustomerStatus.fromString(customerStatus);
	}
	
	 @Then("the shipping cost is $costs")
	 public void thwShippingCostIs(double costs) {
		 Assert.assertEquals(new BookOrder(customerStatus, customerLocation).getShippingCost(), costs, 0.0);
	 }
}
