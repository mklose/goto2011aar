package goto2011aar.example1.fixtures;

import java.util.List;

public class OrderPositions extends DoTableWithId {

	@Override
	void insertEntry(int id,List<String> tableEntry) {
		ShopSetUp.shop.addPositionToOrder(toId(1),toId(2),toId(3));
	}

}
