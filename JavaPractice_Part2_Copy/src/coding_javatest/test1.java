package coding_javatest;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Test script name is: ");
		  
		  String inpstr = "ABCD123EFT45 1%";

		  int[] alphacnt = new int[26];
		  int[] digcnt = new int[9];
		  int alphacount = 0;
		  int digcount = 0;
		  int totalcount =0;

		  for(int i=0; i<inpstr.length();i++)
		  {
		  	char ch = inpstr.charAt(i);

		   if(!Character.isLetter(ch)&&!Character.isDigit(ch))
		  	{
		  	continue;
		  	}

		    if(Character.isLetter(ch))
		  	{
		  		//alphacnt[ch]++ ;
		  		alphacount ++;
		  	}

		  	
		   else if(Character.isDigit(ch))
		  	{
		  		//digcnt[ch]++;
			   System.out.println( Character.getNumericValue(ch));
		  		digcount++;
		  	}


		  }

		  totalcount = alphacount +digcount;

		  System.out.println("letter count is "+alphacount);
		  System.out.println("Digit count is "+digcount);
		  System.out.println("Total count is" + totalcount);
		      
		  
		  
    
	}

}
