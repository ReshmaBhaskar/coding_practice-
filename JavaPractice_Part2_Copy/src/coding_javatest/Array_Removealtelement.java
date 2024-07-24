package coding_javatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Removealtelement {

	public static void main(String[] args) {
	
			  	//remove numbers that contain "."		  
			  String arr[] = {"5.0","99","5.5","100","6.0","101"};
	            List<String> list = new ArrayList<String>(Arrays.asList(arr));
	            for(int i = list.size() - 1 ; i >= 0 ; i--) {
	                String number = list.get(i);
	                if(number.contains(".")) {
	                    list. remove(number);
	                }
	            }
	            
	            for(String val : list) {
	                System.out.println(val);
	            }
	            
	            
	            
	            
	    		//Remove every alternate number in the array
	            String arr1[] = {"5.0","99","5.5","100","6.0","101"};
	            List<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
	            for(int i = 1 ; i<=list.size(); i++) {
	               {
	                list1.remove(i);
	                }
	            }
	            
	            for(String val : list1) {
	                System.out.println(val);
	            }
	            
	            
		
	}
	}
	


