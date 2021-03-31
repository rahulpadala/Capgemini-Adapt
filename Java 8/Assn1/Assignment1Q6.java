package Assn1;
import java.util.Scanner;


class Login{
    String userId = "Ajay",password = "password";
    int c = 3;
    String s1 = "You have entered wrong credentials 3 times\r\n" + 
    		"\r\n" + 
    		"Contact Admin";
    String p;
    Scanner sc = new Scanner(System.in);
    public String loginUser(String user, String pass) 
    {
    	   System.out.println("User Id:"+user);
    	   while(c>0)
    	   {
    		   System.out.println("Enter the password :");
    		   p = sc.next();
    		   if(p.equals(pass))
    		   {
    			   return "Welcome "+user;
    		   }
    		   c--;
    		   if(c!=0)
    		   {
    		   System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    		   }
    		   
    	   }
    	   return s1;
    }

}

public class Assignment1Q6 {
	
	 public static void main(String[] args) {
		 
		 String user , pass;
		 Scanner sc = new Scanner(System.in);
		 user = sc.next();
		 pass = sc.next();
		 Login lo = new Login();
		 System.out.println(lo.loginUser(user, pass));
		 
		 
	 }

}
