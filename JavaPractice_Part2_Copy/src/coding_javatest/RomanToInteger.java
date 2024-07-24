package coding_javatest;

public class RomanToInteger {
	
	
    public int NumValue(char rom) {
      if (rom == 'I')
         return 1;
      if (rom == 'V')
         return 5;
      if (rom == 'X')
         return 10;
      if (rom == 'L')
         return 50;
      if (rom == 'C')
         return 100;
      if (rom == 'D')
         return 500;
      if (rom == 'M')
         return 1000;
      return -1;
   }

    public int romanToInt(String s) {
	    int sum = 0;
	      for (int i=0; i<s.length(); i++)
	      {
	         int s1 = NumValue(s.charAt(i));
	         if (i+1 <s.length()) 
	         {
	           int s2 = NumValue(s.charAt(i+1));
	           if (s1 >= s2) {
	              sum = sum + s1;
	           }
	           else
	           {
	              sum = sum - s1;
	           }
	        }
	        else 
	        {
	           sum = sum + s1;
	        } 
	     }  
	     return sum;
	   }
	
	public static void main(String[] args)
	
	{
		RomanToInteger  obj= new RomanToInteger();
		String inputRoman= "LXVII";
		//romantoInt name = new romantoInt();
		//name.romanToInt(inputRoman);
	      System.out.println("The Integer value of given Roman number is: "+obj.romanToInt(inputRoman));
		

	     
	}

}

