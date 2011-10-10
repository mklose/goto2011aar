package goto2011aar.example1.fixtures;

import goto2011aar.example1.Location;

import java.util.List;

public class Locations extends DoTableWithId {

	@Override
	void insertEntry(int id,List<String> tableEntry) {
		ShopSetUp.shop.addLocations(new Location(id,tableEntry.get(1),Double.parseDouble(tableEntry.get(2))));
	}

}
