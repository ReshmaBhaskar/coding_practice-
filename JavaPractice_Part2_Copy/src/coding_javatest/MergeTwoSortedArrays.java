package coding_javatest;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    
		 //Merge two sorted arrays
		 
		 int a[] = {1,4,6};
		 int[] b = {8,3,2};
		 int i=0, j=0,k=0;
		 
		 //output should be {1,2,3,4,6,8}
		 
		Arrays.sort(a);
		Arrays.sort(b);
		
		int[] c = new int[a.length+b.length];
		//System.out.println(c.length);
		
			while(i<a.length && j<b.length)
			{
				if(a[i]<=b[j]) {
					c[k++] = a[i++];
			}
		     else {
	                c[k++] = b[j++];
	            }
			}
			
			// Add remaining elements from array 'a', if any
			while (i < a.length) {
		            c[k++] = a[i++];
		        }
	        
		        // Add remaining elements from array 'b', if any
		        while (j < b.length) {
		            c[k++] = b[j++];
		        }

			for(int l=0;l<c.length;l++) {
				System.out.println(c[l]);
			}
			
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 
	}
}
