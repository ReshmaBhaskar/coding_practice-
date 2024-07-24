package coding_javatest;

public class string_mostRepeatedWordinSen {

	public static void main(String[] args) {
				
		 int maxCount = 0;
		 
		 String str = "my name is reshma. name has lastname. lastname is bhaskar name";
		 //o/p - name -> 3		
		 
		 String[] words = str.replaceAll("[^a-zA-Z\s]","").trim().split("\\s+");
		String mostrepeatedword = "";
		
		
		for(int i =0;i<words.length;i++)
		{
			int  count = 1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))
				{
					count++;		
				}
			}
			
            if (count > maxCount)
            {
            	mostrepeatedword = words[i];
                maxCount = count;
            }
		}
		 System.out.println(mostrepeatedword);
		 System.out.println(maxCount);
		
	  


	}

}
