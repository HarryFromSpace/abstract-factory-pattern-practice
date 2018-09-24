import org.springframework.boot.autoconfigure.SpringBootApplication;

import Abstract.AbstractFactory;
import Interface.Color;
import Interface.Shape;
import Service.FactoryGenerator;

@SpringBootApplication
public class FactoryPatternPractiseApplication {

	public static void main(String[] args) {

		// Shape Factory
		AbstractFactory shapeFactory = FactoryGenerator.getFactory("SHAPE");
		Shape shapeOne = shapeFactory.getShape("CIRCLE");
		shapeOne.draw();
		Shape shapeTwo = shapeFactory.getShape("RECTANGLE");
		shapeTwo.draw();

		// Color Factory
		AbstractFactory colorFactory = FactoryGenerator.getFactory("COLOR");
		Color colorOne = colorFactory.getColor("GREEN");
		colorOne.fill();

	}

}
