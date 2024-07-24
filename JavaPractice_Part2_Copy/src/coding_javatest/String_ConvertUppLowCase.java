package coding_javatest;

import java.util.Scanner;

public class String_ConvertUppLowCase {

	
	public static String ConvertUppLowCase(String str)

	{
	    //String str = "Resh is BAD";
	    
	    //conevrt to char array & use for loop to traverse
	    char[] chararr = str.toCharArray();
	    
	    for(int i = 0; i<chararr.length;i++)
	    {
	        char ch = chararr[i];
	        if(Character.isUpperCase(ch))
	        {
	            chararr[i] = Character.toLowerCase(ch);
	        }
	        else if (Character.isLowerCase(ch))
	        {
	           chararr[i] = Character.toUpperCase(ch);
	        }
		}
	    return new String(chararr);
	}
	
	
	public static void main (String[] args)
	{
		 // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    String str = s.nextLine();
	    System.out.print(ConvertUppLowCase(str)); 
	    
	  
	}

}




////-----Without using functions-----------
//String  str = "ReshisBAD";
//char[] chararr = str.toCharArray();
//StringBuilder strbld = new StringBuilder();
//   
//   for(int i = 0; i<chararr.length;i++)
//   {
//       char ch = chararr[i];
//       if(Character.isUpperCase(ch))
//       {
//           chararr[i] = Character.toLowerCase(ch);
//           strbld.append(chararr[i]);
//       }
//       else if (Character.isLowerCase(ch))
//       {
//          chararr[i] = Character.toUpperCase(ch);
//          strbld.append(chararr[i]);
//       }
//	}
//   
//   
//   System.out.println(new String(chararr));
//   System.out.println(strbld.toString());
