package coding_javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ds_HashMapSortingbyVal {

	public static void main(String[] args) {
		
		
		//HashMap sorting by value - String
		HashMap<String, String> map = new HashMap<>();
        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        map.put("2", "B");
        map.put("8", "A");
        map.put("4", "D");
        map.put("7", "F");
        map.put("6", "W");
        map.put("19", "J");
        map.put("1", "Z");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<String>() {
            public int compare(String str, String str1) {
                return (str).compareTo(str1);
            }
        });
        for (String str : list) {
            for (Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }
        System.out.println(sortedMap);
        
        
        
        
        //HashMap sorting by value - Integer
        HashMap<String, Integer> map1 = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap1 = new LinkedHashMap<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        map1.put("A", 5);
        map1.put("B", 7);
        map1.put("C", 3);
        map1.put("D", 1);
        map1.put("E", 2);
        map1.put("F", 8);
        map1.put("G", 4);
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            list1.add(entry.getValue());
        }
        Collections.sort(list1); 
        for (int num : list1) {
            for (Entry<String, Integer> entry : map1.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap1.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(sortedMap1);
        

	}

}
