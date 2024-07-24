package coding_javatest;

import java.util.Scanner;

public class AddNumbers {

	public static void main (String args[])
	 {
		 Scanner reader = new Scanner(System.in);
		 System.out.println("please enter two numbers: ");
		  int num1 = reader.nextInt();
		  int num2 = reader.nextInt(); 
		  
		  System.out.println("you entered:" + num1);
		  System.out.println("you entered:" + num2);
		  
		  int sum = num1+num2;
		  System.out.println("Sum of two numbers is: " +sum);
		  
	 }
	
}


