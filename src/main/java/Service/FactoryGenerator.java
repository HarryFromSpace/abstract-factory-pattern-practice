package Service;

import Abstract.AbstractFactory;
import Factory.ColorFactory;
import Factory.ShapeFactory;

public class FactoryGenerator {
	public static AbstractFactory getFactory(String factoryType) {
		if(factoryType==null)
			return null;
		if(factoryType.equalsIgnoreCase("SHAPE"))
			return new ShapeFactory();
		if(factoryType.equalsIgnoreCase("COLOR"))
			return new ColorFactory();
		return null;
	}
}
