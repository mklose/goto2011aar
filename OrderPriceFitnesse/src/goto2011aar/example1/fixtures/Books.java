package goto2011aar.example1.fixtures;

import goto2011aar.example1.Book;
import java.util.List;

public class Books extends DoTableWithId {

	@Override
	void insertEntry(int id, List<String> book) {
		ShopSetUp.shop.addBook(new Book(id,book.get(1), Double.parseDouble(book.get(2))));	
	}
	
}
