package coding_javatest;

public class arraytest {

		public static void main(String[] args)
		{

			
		// to print multidimensional array
			
		int i,j; //assume 'i' as 'rows' , 'j' as 'cols'
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{3,2,1},{6,5,4}};
		
				
		for (i=0; i<(a.length);i++)
		{
			for(j=0;j<(a[i].length);j++)
			{
				System.out.println("first array is -" + a[i][j]);
			}
			

			for(j=0;j<(b[i].length);j++)
			{
				System.out.println("second array is -" + b[i][j]);
			}
		}
	}

}



