package goto2011aar.example4.fixtures;

import fitnesse.slim.Converter;
import goto2011aar.example4.CustomerStatus;

public class CustomerStatusConverter implements Converter {

	@Override
	public Object fromString(String string) {
		return CustomerStatus.fromString(string);
	}

	@Override
	public String toString(Object object) {
		return object.toString();
	}

}
