package goto2011aar.example1.fixtures;

import goto2011aar.example1.Order;

public class OrderPrice {

	private Order order; 
	public void setOrderId(int orderId){
		order =ShopSetUp.shop.getOrder(orderId);
	}
	
	public double price(){
		return order.getPrice();
	}
	
	public double shippingCosts(){
		return order.getShippingCost();
	}
}
