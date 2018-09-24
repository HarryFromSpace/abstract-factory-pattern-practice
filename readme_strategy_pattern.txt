1) Just Import as maven the Project in eclipse.
2) And run as java application

3) This is implementation of abstract Factory Pattern:-
	a) First of all, We have two interface: -  Shape and Color
	b) Then we have Models package which contains some specific classes each one will implement one interface.
		Red.class , Green.class , Blue.class will implement Color Interface.
		Rectangle.class , Circle.class will implement Shape Interface
	c) Now we can create interface/abstract class (AbstractFactory) which contains:-  getColor(String colorType) , getShape(String shapeType).
	d) Now we will create Two Factory Classes: - ShapeFactory and ColorFactory , both will extend AbstractFactory class.
	[Note:- Now you can test this:-
		-> Create object of AbstractFactory.
		-> Call any of the two function for getting "specific instance of color" or "specific instance of shape" ,
		   How to narrow down to specific Object??
			We will call getColor() or getShape() to get color classes or shape classes.
			Then we have also passed parameters to above function for getting specific instance of Shape/Color.]
	e) Now we will create FactoryGenerator class, and implement a static function "getFactory(String factoryType)".
	f) We want to return factory instance(i.e. ColorFactory/ShapeFactory) from single function How can we do that??
	   Thats the reason we have implemented AbstarctFactorywhich is extended by both the classes , 
	   So parent can hold reference of child (Downcasting).
	   Hence, return type is AbstractFactory. 
	   we will check if User Passed "SHAPE" as parameter, we will arrange ShapeFactory Instance 
	   and if user pass "COLOR" as parameter, we will arrange ColorFactory Instance.
	g) Now From main Class, Just call Static method "getFactory()" from Class name(FactoryGenerator) also pass parameter.
	   It will provide AbsractFactory instance which contains refernce to specific Factory(ie ColorFactory or ShapeFactory).
	   Now, from AbstractFactory instance you can call "getShape()/GetColor()" method accordingly and enjoy with the instance.

Hope You liked it..!!!
Please Rate your Experience..!!!!
Himanshu Nagpal (harryFromSpace) 
