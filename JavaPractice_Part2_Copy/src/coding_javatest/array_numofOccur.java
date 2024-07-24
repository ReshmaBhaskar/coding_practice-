package coding_javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class array_numofOccur {

	public static void main(String[] args) {
	
		//-------print number of occurrence for each distinct element in the array-------
	

		int[] intarr = {10, 20, 30, 10, 20, 40, 50};
		
		 List<Integer> distinctElements = new ArrayList<>();
		 List<Integer> elementCounts = new ArrayList<>();
		
		 // Iterate through the array and count occurrences
		 for (int num : intarr) {
		     int index = distinctElements.indexOf(num);
		     if (index == -1) { //if the element is not already prst in distinct elements array
		     	 
		         distinctElements.add(num);
		         elementCounts.add(1);
		     } else {
		     	
		         int count = elementCounts.get(index);
		         elementCounts.set(index, count + 1);
		     }
		 }
		
		 // Print the element frequencies
		 for (int i = 0; i < distinctElements.size(); i++) {
		     int element = distinctElements.get(i);
		     int frequency = elementCounts.get(i);
		     System.out.println("Element " + element + " occurs " + frequency + " times.");
		 }

		

	}

}


//using HashMap<>()
//-------print number of occurrence for each distinct element in the array-------

	//int[] intarr = {10, 20, 30, 10, 20, 40, 50};
	//
	//HashMap<Integer,Integer> occurenceMap = new HashMap<>();
	//
	//for(int num:intarr)
	//{
	//	occurenceMap.put(num, occurenceMap.getOrDefault(num, 0)+1);
	//}
	//
	////print it
	//for(Map.Entry<Integer, Integer> output:occurenceMap.entrySet())
	//{
	//	System.out.println(output);
	//}
	

//other print statement using keyset()
////  for (int num : occurenceMap.keySet()) {
////        System.out.println("Element: " + num + ", Occurrences: " + occurenceMap.get(num));
//    }



