package exercises.java.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
 
public class SearchChar{
    public static void main(String args[])
    {
    	System.out.println("Type the char");
    	Scanner userInput= new Scanner(System.in);
        char searching = userInput.next().charAt(0);
        
        try{
            FileInputStream fis=new FileInputStream("C:\\Users\\lavg_\\workspace\\Solution_java2\\src\\exercises\\java\\IO\\SearchText.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            
            int i;
            int times=0;
             
            while((i=bis.read())!=-1)
            {
                char a=(char)i;
                if(a==searching)
                {
                 times++;
                }
            }
            System.out.println("The char '"+searching+"' was found "+times+" times" );
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}