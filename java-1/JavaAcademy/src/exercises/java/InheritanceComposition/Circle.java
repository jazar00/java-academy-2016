package exercises.java.InheritanceComposition;

public class Circle {
	//variables
	private double radius;
	private String color;
	
	//constructor for circle with radius 1.0 and color red
	public Circle(){
		this.radius=1.0;
		this.color="red";
	}
	//constructor for circle with color red
	public Circle(double radius){
		this.radius=radius;
		this.color="red";
	}
	//constructor
	public Circle(double radius, String color){
		this.radius=radius;
		this.color=color;
	}
	
	//getters and setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//calculate the area
	public double getArea(){
		double area;
		area=radius*radius*3.1416;
		return area;
	}
	
	//put circle data in a string
	public String toString(){
		String data="Circle radius:"+radius+"Circle area:"+getArea()+"Circle color:"+color;
		return data;
	}

}
