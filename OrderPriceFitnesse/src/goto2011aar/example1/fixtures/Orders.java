package goto2011aar.example1.fixtures;

import goto2011aar.example1.Order;

import java.util.List;

public class Orders extends DoTableWithId {

	@Override
	void insertEntry(int id,List<String> tableEntry) {
		ShopSetUp.shop.addOrder(new Order(id),toId(1));
	}

}
