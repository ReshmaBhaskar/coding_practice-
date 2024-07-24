package coding_javatest;

public class LongestCommonPrefix {

	
	// Java Program to find the longest common prefix



	public static void main(String[] args)
	{
		
		
		String str[] = {"Flea","Fle","Flu","klourish"};
		 
		 String prefix = str[0];
		// String substring="";
		 
		 for(int i=1; i<str.length;i++) {
			 
			  System.out.println("I am counter -" + i);
		            
			  while (!str[i].startsWith(prefix)) {   //while(str[i].indexOf(prefix)!=0)
	                  prefix = prefix.substring(0, prefix.length() - 1);  //choose the updated common prefix 
		                  	
		                  System.out.println("I am string - " + str[i]);
		                  System.out.println("I am prefix - " + prefix);
		               
	                  	if (prefix.isEmpty()) {
	                  		System.out.println("No common prefix in this input");
		                }
		            }
		        }
				 System.out.println(prefix);
		
		
		
		
		
		
		
	}
	}
	// for other code: refer code contributed by 29AjayKumar

