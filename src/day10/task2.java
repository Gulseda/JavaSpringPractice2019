package day10;



import java.util.Scanner;


public static void main(String[] args) {
		
//local variables must be assigned a value before usage
//if local variable has a single chancce 
//not get a value before usage,
//compiler will no compile the code
//we need to make sure varible needs to get assigned.
		
int i = 0; // i ye 0 i atadik,cunku only i yazinca compile olmuyor


Scanner scan = new Scanner(System.in);

//we are asking question to user

System.out.println("Do you want to give value to i");

String yesNoAnswer = scan.next();

if( yesNoAnswer.equalsIgnoreCase("yes") ) {
	
	System.out.println("You said yes");
	System.out.println("Enter your number");
	
	i = scan.nextInt();
	
}else {
	System.out.println("You said no");
}  
System.out.println(" The value of i : " + i );
// System.out.println(i); de olur.
	}

	}

