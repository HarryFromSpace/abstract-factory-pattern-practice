package Factory;

import Abstract.AbstractFactory;
import Interface.Color;
import Interface.Shape;
import Models.Circle;
import Models.Rectangle;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null)
			return null;
		if (shapeType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		if (shapeType.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		return null;
	}

}
