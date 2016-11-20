package exercises.java.InheritanceComposition.Shape;

public class TestShape {
	public static void main(String[] args) {
		
		Shape shape1 = new Circle(3.3,"blue",true);
		System.out.println(shape1.toString());
		
		Shape shape2= new Square(2.5,"green",false);
		System.out.println(shape2.toString());
		
		Shape shape3=new Rectangle(3.45,5.67,"yellow",true);
		System.out.println(shape3.toString());
	}
}
