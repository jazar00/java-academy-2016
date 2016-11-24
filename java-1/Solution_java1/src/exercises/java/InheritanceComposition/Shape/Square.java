package exercises.java.InheritanceComposition.Shape;

public class Square extends Rectangle{
	
	//constructor
	public Square(){
		super();
		double side = 0.0;
	}
	//constructor
	public Square(double side){
		super(side,side);
	}
	//constructor
	public Square(double side,String color, boolean filled){
		super(side,side,color,filled);
	}
	
	//getters and setters
	public double getSide(){
		return super.getWidth();
	}

	public void setSide(double side){
		super.setLenght(side);;
	    super.setWidth(side);
	}
	
	@Override //method for area
	public double getArea(){
		double data =getSide()*getSide();
		return data;
	}
	@Override //method for perimeter
	public double getPerimeter(){
		double data =4*getSide();
		return data;
	}
	  
	@Override//put rectangle data in a string
	public String toString(){
		String data = "Square color: "+super.getColor()+" Square filled: "+super.isFilled()+" Square area: "+getArea()+" Square perimeter: "+getPerimeter() ;
		return data;
	}
	   
}
