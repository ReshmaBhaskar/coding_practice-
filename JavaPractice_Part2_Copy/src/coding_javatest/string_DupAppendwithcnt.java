package coding_javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class string_DupAppendwithcnt {

	public static void main(String[] args) {
		
//		String[] inputArray = {"Doc", "Spy", "Doc", "sub", "Cart", "Spy", "Doc"};
//        Map<String, Integer> countmap = new HashMap<>();
//        List<String> outputList = new ArrayList<>();
//
//        for (String str : inputArray) {
//            int count = countmap.getOrDefault(str, 0);
//            countmap.put(str, count + 1);
//            outputList.add(count == 0 ? str : str + count);
//        }
//
//        System.out.println(outputList);
        
        
        //get the string, create a new list, add to list & increment counter for that string
		
		//List<String> newinp = new ArrayList<>();
			String[] inputArray = {"Doc", "Spy", "Doc", "sub", "Cart", "Spy", "Doc"};
	        List<String> outlist = new ArrayList<>();
	        int[] count = new int[inputArray.length];

	        for (String str : inputArray) 
	        {
	            int index = outlist.indexOf(str);
	            if (index != -1) 
	            {	            	
	                count[index] = count[index] + 1;	             
	                outlist.add(str + count[index]);
	                //System.out.println(str + count[index]);	                
	            } 
	            else 
	            {
	                outlist.add(str);
	                //count[outlist.size() - 1] = 0;
	               // System.out.println(count[outlist.size() - 1]);
	            }
	        }

	       
	        String[] outputArray = outlist.toArray(new String[0]);
	        
	        for (String item : outputArray) {
	            System.out.println(item);
	        }
		
		
        
        
	}

}


//String[] intArray = {"cost", "DUE", "Stone", "cost", "Stone", "DUE", "Stone", "whole", "cost"};
//
//Map<String,Integer> countmap = new HashMap();
//List<String> outputlist = new ArrayList<>();
//
//for(String str: intArray)
//{
//	
//   int count = countmap.getOrDefault(str,0);
//   System.out.println(count);
//   
//     countmap.put(str,count+1);
//     
//     if (count==0)
//     {	
//    	 System.out.println(str);
//         outputlist.add(str);
//     }
//     else 
//     {
//    	 System.out.println(count);
//    	 System.out.println(str+count);
//         outputlist.add(str+count);
//     }

//}

// System.out.println(outputlist)
//for(String op: outputlist)
//{
//   System.out.println(op);
//}
//





// Initial state: countMap={}, outputList=[]

// Iteration 1 - str="cost"
// count=0 (default value)
// countMap={"cost"=1}, outputList=["cost"]

// Iteration 2 - str="DUE"
// count=0 (default value)
// countMap={"cost"=1, "DUE"=1}, outputList=["cost", "DUE"]

// Iteration 3 - str="Stone"
// count=0 (default value)
// countMap={"cost"=1, "DUE"=1, "Stone"=1}, outputList=["cost", "DUE", "Stone"]

// Iteration 4 - str="cost"
// count=1 (existing count for "cost")
// countMap={"cost"=2, "DUE"=1, "Stone"=1}, outputList=["cost", "DUE", "Stone", "cost1"]

// Iteration 5 - str="Stone"
// count=1 (existing count for "Stone")
// countMap={"cost"=2, "DUE"=1, "Stone"=2}, outputList=["cost", "DUE", "Stone", "cost1", "Stone1"]

// Iteration 6 - str="DUE"
// count=1 (existing count for "DUE")
// countMap={"cost"=2, "DUE"=2, "Stone"=2}, outputList=["cost", "DUE", "Stone", "cost1", "Stone1", "DUE1"]

// Iteration 7 - str="Stone"
// count=2 (existing count for "Stone")
// countMap={"cost"=2, "DUE"=2, "Stone"=3}, outputList=["cost", "DUE", "Stone", "cost1", "Stone1", "DUE1", "Stone2"]

// Iteration 8 - str="whole"
// count=0 (default value)
// countMap={"cost"=2, "DUE"=2, "Stone"=3, "whole"=1}, outputList=["cost", "DUE", "Stone", "cost1", "Stone1", "DUE1", "Stone2", "whole"]

// Iteration 9 - str="cost"
// count=2 (existing count for "cost")
// countMap={"cost"=3, "DUE"=2, "Stone"=3, "whole"=1}, outputList=["cost", "DUE", "Stone", "cost1", "Stone1", "DUE1", "Stone2", "whole", "cost2"]

// Final state: countMap={"cost"=3, "DUE"=2, "Stone"=3, "whole"=1}, outputList=["cost", "DUE", "Stone", "cost1", "Stone1", "DUE1", "Stone2", "whole", "cost2"]


