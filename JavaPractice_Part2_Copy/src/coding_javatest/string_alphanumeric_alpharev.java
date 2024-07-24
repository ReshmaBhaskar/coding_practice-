package coding_javatest;

public class string_alphanumeric_alpharev {


	
	public static void main(String[] args) {
		
		//if input = "abcd12the65resh7"; expected output is "dcba12eht65hser7"
		String input = "abcd12the65resh7";
		 StringBuilder reversedAlpha = new StringBuilder();
	        StringBuilder currentAlpha = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                // Store the current alphabet characters in reverse order 
	                currentAlpha.insert(0, ch);
	               // System.out.println(currentAlpha.toString()); 
	            } else {
	                // Append the reversed alphabet characters and the digit
	                reversedAlpha.append(currentAlpha);	   
	                currentAlpha.setLength(0);
	                reversedAlpha.append(ch);
	                
	            }
	        }
	        // Append any remaining alphabet characters
	       reversedAlpha.append(currentAlpha);

	        System.out.println(reversedAlpha.toString()); 

	        
	        
		//'---------------------------'
		//if input is "aaabbbbcccc"; output should be "a3b4c4"

		String str = "aaabbbbcccc";
		int cnt = 1;
		int newcnt = 0;
		StringBuilder alpha = new StringBuilder();
		
			char[] ch=str.toCharArray();
			
			for(int j=0; j<ch.length-1;j++) 
			{
				if (Character.isLetter(ch[j]) && Character.isLowerCase(ch[j])) 
				{
					if (ch[j]==ch[j+1]) 
					{
						newcnt = ++cnt;
					}
					else if((ch[j]!=ch[j+1]))
					{
						alpha.append(ch[j]);
						alpha.append(newcnt);
						cnt=1;
					}
				}
			}
			//append the last character & it's count
			alpha.append(str.charAt(str.length()-1));
			alpha.append(cnt);
			
			System.out.println(alpha.toString());
	
			
			//'---------------------------'
			//if input is "abdcda12@#a134"; output should have count of the number of unique alphabets, digits & special characters
			//and also unique alpha & digit & special character
			 String newdigstr ="";
			 String newalphastr="";
			 String newspcharstr="";
			 str =  "abdcdda12@a134";
			 int digcnt = 0;
			 int charcnt=0;
			 int specialcharcnt = 0;
			 int digcntarr[] = new int[10];
			 int alphacntarr[] = new int[26];
			 int specialchararr[] = new int[126];
			 char charvalue; 
			 int specialcharval=0;
	
			 
			 String strdigits = str.replaceAll("\\D+",""); //replaces all non-digit with "" empty string
			 String stralpha = str.replaceAll("\\d+","");  //replaces all digits with "" empty string
			 String strspecialchar = str.replaceAll("[A-Za-z0-9]",""); //replaces all non alphanumeric with empty "" string
			// System.out.println(strspecialchar);
			
			 
			 for(int l=0;l<strdigits.length();l++)
			 {
				 char c = strdigits.charAt(l);
				 //System.out.println(c);
				 if(Character.isDigit(c)) 
				 {
					 digcnt++;
					 int digvalue = Character.getNumericValue(c);
					 digcntarr[digvalue]++;
					 //System.out.println(digcntarr[digvalue]);
				 }
				 
			
			 }
			 
			 for (int k=0;k<stralpha.length();k++)
			 {
				 char c = stralpha.charAt(k);
				  if(Character.isLetter(c)) 
				 {
					 charcnt++;
					  charvalue = Character.toLowerCase(c);
					 alphacntarr[charvalue-'a']++;
					// System.out.println( alphacntarr[charvalue-'a']);
				 }
			 }
				
				 
			 
			 for (int h=0;h<strspecialchar.length();h++)
			 {
				 char cha = strspecialchar.charAt(h);
				 if (!(Character.isLetter(cha) && !(Character.isDigit(cha))))
				 {
					 specialcharcnt++;
					 specialcharval = Character.valueOf(cha);
					// System.out.println(specialcharval);
					 specialchararr[specialcharval]++;
					
				 }
			 
			 }
		
              			
			
			 StringBuilder digstr = new StringBuilder();
			 StringBuilder alphastr = new StringBuilder();
			 StringBuilder spcharstr = new StringBuilder();
			 
			 for(int m = 0; m<digcntarr.length;m++)
			 {
				 int digitcnt = digcntarr[m];
				 int digits = m;
				 
				 //display unique digits & if the count of that digit is 1 (single occurence)
				 if (digitcnt>0 )
				 {
					 System.out.println("digit is - "+digits+". digit count is -"+digitcnt);
					  newdigstr =  digstr.append(digits).toString();
					 
				 }
				 
			 }
			 
			 
			 for(int n = 0; n<alphacntarr.length;n++)
			 {
				 int alphacnt = alphacntarr[n];
				
				 
				 //display unique digits & if the count of that digit is 1 (single occurence)
				 if (alphacnt>0 )
				 {
					 char alphaval = (char)( n+'a');
					 System.out.println("alpha is - "+alphaval+". alpha count is -"+alphacnt);
					  newalphastr =  alphastr.append(alphaval).toString();
					 
				 }
				 
			 }
			 
			 

			 for(int p = 0; p<specialchararr.length;p++)
			 {
				 int spcharcnt = specialchararr[p];
		
				
				 
				 //display unique digits & if the count of that digit is 1 (single occurence)
				 if (spcharcnt>0 )
				 {
					 char spcharval = (char)( p);
					 //System.out.println(spcharcnt);
					 System.out.println("Special char is - "+spcharval+". Special char count is -"+spcharcnt);
					  newspcharstr =  spcharstr.append(spcharval).toString();
					 
				 }
				 
			 }
			 
			
			 System.out.println("unique set of digits is - "+newdigstr);
			 System.out.println("unique set of alpha is - "+newalphastr);
			 System.out.println("unique set of special char is - "+newspcharstr);
			 
			 
			 
			 
			
		
	}
	
	
	
	
	

}
