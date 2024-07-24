package coding_javatest;

public class string_SumofNuminAlphaNumericString {

	public static void main(String[] args) {
		//find the sum of numbers in alpha numeric string

		
		/* String str="java432doc1";
		int sum =0;
		//get every character , checkif digit & add or not
		
		for(int i=0; i<str.length();i++)
		{
		  Character Character =	str.charAt(i);
		  boolean isdigit = Character.isDigit(Character);
		  
		  if(isdigit)
		  {
			  sum=sum+java.lang.Character.getNumericValue(Character);
		  }
			
		}
		
		System.out.println(sum);
		*/
		
		//if its an array of strings
		int total = 0;
		String[] Arr = {"1abcdef3","123","plvvv","a1c"};
		
		for(int i=0; i<Arr.length;i++)
		{
			for (char c : Arr[i].toCharArray()) 
			{
			    if (Character.isDigit(c)) {
			        total += Character.getNumericValue(c);
			    }
		}
		
		}	
		
		System.out.println(total);
		
		
		/*
		String str="java432doc1";
		int total = 0;
		for (char c : str.toCharArray()) {
		    if (Character.isDigit(c)) {
		        total += Character.getNumericValue(c);
		    }
		}
		System.out.println(total);
		*/
	}
	
	
}

