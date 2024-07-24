package coding_javatest;

public class string_MaxLongestWordOcc {

	public static void main(String[] args) {
		// find the max longest max repeating word in sentence

		 int maxlen = 0;
		 String longestword = "";
		 int lastindex =0;
		 int count = 0;
		 
		 String str = "my name is reshma. name has lastname. lastname is bhaskar";
		 //o/p - lastname -> 2
		 
		 String[] words = str.replaceAll("[^a-zA-Z\s]","").split("\\s+");
		 
		 for(String word:words) {
			 int len = word.length();
			 if(len>maxlen) {
				 maxlen = len;
				 longestword = word;
			 }
		 }
		 System.out.println(longestword+" : "+maxlen);
		 
		 
		 String newstr = str.replaceAll("[^a-zA-Z\s]","");
		 while(lastindex!=-1) {
			 
			 lastindex = newstr.indexOf(longestword, lastindex);
			 
			 if(lastindex!=-1) {
				 count++;
				 lastindex += longestword.length();
			 }
			 
			 
		 }
		 
		 System.out.println(count);
	  
	  
	 }
}
		

