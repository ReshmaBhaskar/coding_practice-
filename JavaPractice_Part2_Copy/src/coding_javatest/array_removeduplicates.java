package coding_javatest;

import java.util.Arrays;

public class array_removeduplicates {

	public static void main(String[] args) {
		
			//remove duplicates in an array
		    int a[] = { 1, 1, 3, 3, 4, 2, 1, 5, 6, 7, 7, 8, 10 };
		  Arrays.sort(a);
		    int j = 0;
		    for (int i = 0; i < a.length - 1; i++) {
		        if (a[i] != a[i + 1]) {
		            a[j] = a[i];
		            j++;
		        }
		    }
		     a[j] = a[a.length - 1];
		    System.out.println(a[a.length - 1]);
		    for (int i = 0; i <= j; i++) {
		        System.out.println(a[i]);
		    }


		    
		    //method - 2 using array stream & distinct function
		    //int a[] = { 1, 1, 3, 3, 4, 2, 1, 5, 6, 7, 7, 8, 10 };
		    int uniquearr[] = Arrays.stream(a).distinct().toArray();
		    
		    System.out.println("Original Array: " + Arrays.toString(a));
	        System.out.println("Array without duplicates: " + Arrays.toString(uniquearr));
	    }
		    
}

/*

//assign the distinct values of the array to new array 
 * 
 * 
 *    	int[] inarr = {65, 72, 72,66, 66, 66, 68, 69, 70, 70, 71}; // Example integer array
	      Arrays.sort(inarr);
	      
	      int[] newarr = new int[inarr.length];
	      int j =0;
	      
	      for(int i =0;i<inarr.length-1;i++)
	      {
	    	  if(inarr[i]!=inarr[i+1]) {
	    		  newarr[j] =inarr[i];
	    		 j++;
	    	  }
	      }
	 
	      newarr[j]= inarr[inarr.length-1];
	     // System.out.println(newarr.length-1);
	      
	      for(int k =0;k<=j;k++)
	      {
	    	  System.out.println(newarr[k]);
	      }
 * 
 * 
 * 
 * 
 */
