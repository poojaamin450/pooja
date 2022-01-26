
import java.io.FileInputStream;
import java.io.IOException;

public class Imp1{
    public static void main(String[] args) throws IOException {
   	
   	 FileInputStream fi=new FileInputStream("a.txt");
   	 
   	 int i=0;
   	
    while((i=fi.read())!=-1) {
   	 System.out.print((char)i);
   	 
    }
   	 
   	 
    }
}



