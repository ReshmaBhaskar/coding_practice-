package coding_javatest;



public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find palindrome of a string
		String str = "Malayalam";
		int i,j=0;
		String rev="";
		String rev1="";
		int len = str.length();
		
		
	//--------------------------------------------------------------------------------	
		//two pointer approach
		String str1 = "Ramari";
	    String inp =  str1.toLowerCase();
	  
	    Boolean Palin = true;
	    int l=0,m=inp.length()-1;
	    
	    while(l<m)
	    {
	       if (inp.charAt(l)!=inp.charAt(m))
	        {
	        	Palin= false;
	            // break;
	        }
	        l++;
	        m--;
	    }
	    
	    if(Palin)
	    {
	        System.out.println("Its Palindrome - "+str);
	    }
	    else	        	
	    {
	    	System.out.println("Its not a Palindrome - "+str);
	    }
		
		
	//--------------------------------------------------------------------------------		
		
		//string concatenation
		for(i=len-1;i>=0;i--) {
			 rev = rev+str.charAt(i);
			 //System.out.println("Reverse String using string concatenation is-"+ rev);
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("Reverse String using string concatenation is Palindrom-"+ rev);
		}
		else {
			System.out.println("Reverse String using string concatenation is not Palindrome-"+ rev);
		}
		
	//--------------------------------------------------------------------------------		
		
		//using character array concatenation
		char a[]= str.toCharArray();
		
		
		for(i=len-1;i>=0;i--) {
			 rev1 = rev1+a[i];
			 //System.out.println("Reverse String using string concatenation is-"+ rev);
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("Reverse String using char array concatenation is Palindrom-"+ rev1);
		}
		else
			System.out.println("Reverse String using char array concatenation is not Palindrome-"+ rev1);
		
		
	//--------------------------------------------------------------------------------		
		
		//Reverse string function in StringBuffer
		StringBuffer strbf = new StringBuffer(str);
		String str_rev = String.valueOf(strbf.reverse());
		
		if (str_rev.equalsIgnoreCase(str)) {
			System.out.println("Reverse String using StringBuffer is Palindrom-"+ str_rev);
		}
		else
			System.out.println("Reverse String using StringBuffer is not Palindrome-"+ str_rev);
		
		
		//
		StringBuilder strbl = new StringBuilder(str);
		String str_rev1 = strbl.reverse().toString();
		
		if (str_rev1.equalsIgnoreCase(str)) {
			System.out.println("Reverse String using StringBuilder is Palindrom-"+ str_rev1);
		}
		else
			System.out.println("Reverse String using StringBuilder is not Palindrome-"+ str_rev1);
		
		
	//--------------------------------------------------------------------------------		
		
		
		//Using Length/2 approach
		/*StringBuilder strbl1 = new StringBuilder(str);
		int str_len1 = Integer.valueOf(strbl1.length());
		for(j=0;j<=(str_len1/2);j++) {
		if( strbl1.charAt(j)!=strbl1.charAt(j-str_len1-1))
		{
			
			System.out.println(true);
		}
		else {
			System.out.println(false);
	}*/
	} 
	}


