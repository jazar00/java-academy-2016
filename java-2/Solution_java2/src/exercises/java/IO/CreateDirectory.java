package exercises.java.IO;

import java.io.*;

public class CreateDirectory {

	public static void main(String[] args){

        File file = new File("C:\\Users\\lavg_\\workspace\\Solution_java2\\src\\exercises\\java\\IO\\NewDirectory");
        if (!file.exists()){
            if (file.mkdir()){
                System.out.println("Directory Created");
            }else{
                System.out.println("Cannot Create Drectory");
            }
        }
	}
	
}
