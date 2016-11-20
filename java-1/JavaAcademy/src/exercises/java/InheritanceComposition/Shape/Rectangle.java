package exercises.java.InheritanceComposition.Shape;

public class Rectangle extends Shape{
	//variables
	protected double width;
	protected double lenght;
	
	//constructor
	public Rectangle(){
		super();
		this.width=0.0;
		this.lenght=0.0;
	}
	
	//constructor
	public Rectangle(double width, double lenght){
		super();
		this.width=width;
		this.lenght=lenght;
	}
	
	//constructor
	public Rectangle(double width, double lenght, String color, boolean filled){
		super(color,filled);
		this.width=width;
		this.lenght=lenght;
	}
	
	//getters and setters
		public double getWidth() {
			return width;
		}
		
		public void setWidth(double width) {
			this.width = width;
		}

		public double getLenght() {
			return lenght;
		}
		public void setLenght(double lenght) {
			this.lenght = lenght;
		}
		
		
		@Override//method for area
		public double getArea(){
			double area=width*lenght;
			return area;
		}
		
		@Override//method for perimeter
		public double getPerimeter(){
			double perimeter =(width*2)+(lenght*2);
			return perimeter;
		}
		
		@Override//put rectangle data in a string
		public String toString(){
			String data = "Rectangle color: "+super.getColor()+" Rectangle filled: "+super.isFilled()+" Rectangle area: "+getArea()+" Rectangle perimeter: "+getPerimeter() ;
			return data;
		}
}
