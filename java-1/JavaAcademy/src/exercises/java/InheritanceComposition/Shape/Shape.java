package exercises.java.InheritanceComposition.Shape;

public class Shape {
	//variables
	protected String color;
	protected boolean filled;
	
	//constructor
	public Shape(){
		this.color="none";
		this.filled=false;
	}
	//constructor
	public Shape(String color, boolean filled){
		this.color=color;
		this.filled=filled;
	}
	
	//getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//method for area
	public double getArea(){
		double area=0.0;
		return area;
	}
	
	//method for perimeter
	public double getPerimeter(){
		double perimeter = 0.0;
		return perimeter;
	}
	
	//put shape data in a string
	public String toString(){
		String data = "Shape color: "+color+" Shape filled: "+filled+" Shape area: "+getArea()+" Shape perimeter: "+getPerimeter() ;
		return data;
	}
}
