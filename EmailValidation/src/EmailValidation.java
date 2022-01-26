

	

	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class EmailValidation {
	    static String [] dataBase= {"abc.com","ppp@gmail.com","yyy@yahoo.net"};


		public static void main(String[] args) {
	        
	        Scanner inp= new Scanner(System.in);
	        String userID;
			while (true){
		     System.out.println(" Please Enter your Email ID--- ");
		     userID = inp.next();
		     while(VerfiyFormate(userID))
		     {
			     System.out.println("---- Please Enter your email ID with valid formate ex: eamaple@domain.xcom --- ");
			     userID = inp.next();
		     }
		     
		     VerfiyID(userID);
		     
		     
		     System.out.println("");

			}
			
		}
		
		private static void VerfiyID(String ID)
		{
			boolean accessFlag= false;
		     for(String id : dataBase)
		     {
		    	 if(ID.equalsIgnoreCase(id))
		    	 {
		    		 accessFlag=true;
			    	 System.out.println("access grant to "+ ID );
		    		 break;
		    	 }   	 
		    	 
		     }
		     
		     if(accessFlag==false)
		     {
		    	 System.out.println("access deined to "+ ID );
		    	 
		     }
				
			
		}
		
		private static boolean VerfiyFormate(String ID)
		{
			String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

			Pattern pattern = Pattern.compile(regex);
		    Matcher matcher = pattern.matcher(ID);

			if(!matcher.matches())
			{
				return true;
				
			}else 
			{
				return false;
				
			}
			
		}

	}


