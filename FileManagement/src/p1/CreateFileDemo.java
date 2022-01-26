package p1;

import java.io.File;

public class CreateFileDemo {
 public static void main(String[] args) {
	 File myfile = new File ("data1.txt");
	 if  (myfile.createNewFile()); {
		 
		 
	 }
	 else {
		 System.out.println("File creation error");
	 }
	 
	 
	 
 }
}
