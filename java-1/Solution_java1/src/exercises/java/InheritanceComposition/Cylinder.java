package exercises.java.InheritanceComposition;

public class Cylinder extends Circle {
	//Variables
	private double height;
	
	//constructor for cylinder of height 1.0
	public Cylinder(){
		super();
		this.height=1.0;
	}
	
	//constructors
	public Cylinder(double height) {
		super();
		this.height=height;
	}
	
	public Cylinder(double height,double radius) {
		super();
		this.height=height;
	}
	
	public Cylinder(double height,double radius, String color) {
		super(radius,color);
		this.height=height;
	}
	
	//getters and setters
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// calculate volume
	public double getVolume() {
		double volume=getArea()*height;
		return volume;
	}

	// put cylinder data in a string
	@Override //replaces inherited method
	public String toString() {
		String data="Cylinder hieght:"+height+super.toString()+" Cylinder volume:"+getVolume();
		return data; 
	}
}
