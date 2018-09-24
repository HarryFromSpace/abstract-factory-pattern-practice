package Factory;

import Abstract.AbstractFactory;
import Interface.Color;
import Interface.Shape;
import Models.Blue;
import Models.Green;
import Models.Red;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		if(colorType == null)
			return null;
		if(colorType.equalsIgnoreCase("RED"))
			return new Red();
		if(colorType.equalsIgnoreCase("BLUE"))
			return new Blue();
		if(colorType.equalsIgnoreCase("GREEN"))
			return new Green();
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

}
