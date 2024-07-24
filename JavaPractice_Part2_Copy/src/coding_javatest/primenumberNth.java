package coding_javatest;

import java.util.Scanner;

public class primenumberNth {

	public static void main(String[] args) {
		// find nth prime number

		 int initnum=1, count=0, i;
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter a number to find the nth prime number: ");
		    int num= sc.nextInt(); 
		  
		    while (count < num)
		    {
		    	
			    initnum=initnum+1; //prime number
			    System.out.println(initnum);
			    
			    for (i = 2; i <= initnum; i++)
			    {
			        if (initnum % i == 0) 
			        {
			          break;
			        }
			    }
		      
				if ( i == initnum)
				{
			       count = count+1;
			    }
		      
		    }
		    
		    System.out.println("Value of nth prime is: " + initnum);
	}

}
