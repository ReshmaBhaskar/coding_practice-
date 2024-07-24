package coding_javatest;

import java.util.Arrays;
import java.util.Collections;

public class arraySORTLarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 40, 30};
		//int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
		
	
		
		//print array in ascending order using sort method
		Arrays.sort(arr);
		for (int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
			//print largest in array
			if (i==arr.length-1)
			{
				System.out.println("largest num : " + arr[i]);
				System.out.println("second largest num : " + arr[i-1]);
			}
		}
		
		
		
		
		//print array in ascending order without using sort method - compare two elements & swap 
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		
		System.out.println(arr[i]);   
		}  
		
		
		
		//----------------------------------------------------------------------------------		
		
		
		//print array in descending order
		Integer arr1[] = {10, 20, 45, 30};
		Arrays.sort(arr1,Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(arr1));   
		
		  
	
		//print array in descending order without using collections built-in method
		for (int i = 0; i < arr1.length; i++)   
		{  
		for (int j = i + 1; j < arr1.length; j++)   
		{  
		int tmp ;
		if (arr1[i] < arr1[j])   
		{  
		tmp = arr1[i];  
		arr1[i] = arr1[j];  
		arr1[j] = tmp;  
		}  
		}  
		
		for(i=0;i<=arr1.length-1;i++)
		System.out.println(arr1[i]);  
		}  
		
		
				
		
		//find second largest number once printed in descending order

		int n=2;
		System.out.println("Second largest number after arranging in descending order is: " + arr1[n-1]);
		
}
	

}
