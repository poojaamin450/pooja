import java.io.FileWriter;
import java.io.IOException;

public class Imp {
 



	public static void main(String[] args) throws IOException {
	   	 String input="hi how are you";
	   	 
	   	 FileWriter fw=new FileWriter("a.txt",true);//if the data should be binded with the previous info in the file we take the arg as true
	   	 
	   	 
	   	 
	   	 fw.write(input);
	   	 System.out.println("data has been put into the file ");
	   
	   	 
	   	 fw.close();
	   	 
	    }
}