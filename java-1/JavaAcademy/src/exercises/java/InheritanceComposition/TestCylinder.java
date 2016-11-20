package exercises.java.InheritanceComposition;

public class TestCylinder {
	
	   public static void main(String[] args) {
		   //cylinder instance
	      Cylinder myCylinder = new Cylinder();
	      System.out.println("Radius: "+myCylinder.getRadius());
	      System.out.println("Height: "+myCylinder.getHeight());
	      System.out.println("Color: "+myCylinder.getColor());
	      System.out.println("Area: "+myCylinder.getArea());
	      System.out.println("Volume: "+myCylinder.getVolume());
	      System.out.println(myCylinder.toString());
	      
	      Cylinder myCylinder2 = new Cylinder();
	      myCylinder2.setRadius(3.0);
	      myCylinder2.setHeight(2.0);
	      myCylinder2.setColor("blue");
	      System.out.println("\nRadius: "+myCylinder2.getRadius());
	      System.out.println("Height: "+myCylinder2.getHeight());
	      System.out.println("Color: "+myCylinder2.getColor());
	      System.out.println("Area: "+myCylinder2.getArea());
	      System.out.println("Volume: "+myCylinder2.getVolume());
	      
	      System.out.println(myCylinder2.toString());
	   }
	}