package coding_javatest;

public class sort_bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,1,3,9,9,7};
		int n= arr.length;

	        //Arrays.sort(arr);
	        for(int i=0;i<n-1;i++)
	        {
	            for(int j=i+1;j<n;j++)
	            {
	                if(arr[i]>arr[j])
	                {
	                    int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
	        
	        //display array
	        for(int i=0;i<n;i++) {
	        	System.out.println(arr[i]);
	        }
	        
	    }

	}


