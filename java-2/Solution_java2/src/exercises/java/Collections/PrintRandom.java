package exercises.java.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintRandom {
	
	public static void main(String[] args){
		Integer myList[]=new Integer[]{1,2,3,4,5};
		random(myList);
		

		
	}
	
	public static void random(Integer[] numbers){
		List<Integer> myList=Arrays.asList(numbers);
		Collections.shuffle(myList);
        myList.stream().forEach(s -> System.out.println(s));
        System.out.println();
        
        for (Integer number: myList) {
            System.out.println(number);;
        }
	}
	
}
