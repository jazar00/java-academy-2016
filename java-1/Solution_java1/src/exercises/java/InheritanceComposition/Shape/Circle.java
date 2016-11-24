package exercises.java.InheritanceComposition.Shape;

public class Circle extends Shape{
	//Variable
	protected double radius;
	
	//constructor
	public Circle(){
		super();
		radius = 0;
	}
	
	//constructor
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	//constructor
	public Circle(double radius, String color, boolean filled){
		super(color,filled);
		this.radius = radius;
	}
	
	//getter && setters
	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}
	
	@Override//method for area
	public double getArea(){
		double area=radius*radius*3.1416;
		return area;
	}
	
	@Override//method for perimeter
	public double getPerimeter(){
		double perimeter =radius*2*3.1416;;
		return perimeter;
	}
	
	@Override//put rectangle data in a string
	public String toString(){
		String data = "Circle color: "+super.getColor()+" Circle filled: "+super.isFilled()+" Circle area: "+getArea()+" Circle perimeter: "+getPerimeter() ;
		return data;
	}
	
}
