
package day9;
		import java.util.Scanner;
   public class examples {
	 public static void main(String[]args) {
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Welcome to Cybertek Banking App");
		 
		 Long accountNumber=12345L;
		 String userPassword="abc123";
		
		 System.out.println("Enter your account number:");
		 Long account=scan.nextLong();
		 scan.nextLine();
		 System.out.println("Enter your password:");
		 String password=scan.nextLine();
		
		 if(accountNumber==account && userPassword.contentEquals(password))
			 System.out.println("login success!");
		 else
			 System.out.println("login failed!");
	 }

	 
	 
   }
 