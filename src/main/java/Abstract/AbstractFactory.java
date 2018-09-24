package Abstract;

import Interface.Color;
import Interface.Shape;

public abstract class AbstractFactory {

	public abstract Color getColor(String colorType);

	public abstract Shape getShape(String shapeType);

}
