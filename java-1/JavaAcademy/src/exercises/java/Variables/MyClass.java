package exercises.java.Variables;

public class MyClass {
	
	//Variables and operators
	//2.-Variable with class level scope
	private static int myNumber= 0;
	
	public void myVoid(){
		
		//3.-Variable with method level scope
		int myNumber2=10;

		
		for(int i=0; i < 5; i++){
			//4.-Variable with loop level scope
			int myNumber3=5;
		}
		
		//5.-Primitive types
		byte myByte = 0111;
		short myShort = 7;
		int myInt = 7;
		long myLong= 7;
		float myFloat= 7.0f;
		double myDouble= 7.0;
		boolean myBoolean = true;
		char myChar ='7';
		
		//6.-Five types of operators
		int x,y,z;
		
		x =4-3;
		y=10%3;
		x--;
		y++;
		z=x*y;
		
		//7.-Two ways of to create a string
		String myString1 ="random text";
		String myString2 = new String("random text");
		
		//8.-Two ways to initialize an array
		String[] myArray1 = new String[10];
		String myArray2[]= {"a","b","c"};

		
	}
	
	
	
}
