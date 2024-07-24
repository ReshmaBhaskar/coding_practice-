package coding_javatest;

import java.util.Scanner;

public class PrintInt {

	// Print integer with user input
	
	//User Scanner class for user input
	 public static void main (String args[])
	 {
		 Scanner reader = new Scanner(System.in);
		 System.out.println("please enter a number: ");
		  int num = reader.nextInt();
		  
		  System.out.println("you entered:" + num);
	 }
	
}
