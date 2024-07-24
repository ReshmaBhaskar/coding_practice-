package coding_javatest;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ds_DuplicateWordsSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find duplicate words in  the input string array
		//ArrayList
		String[] inputArray = {"we", "we", "were", "where","were","were"};

        List<String> duplicates = new ArrayList<>();
        List<String> uniqueWords = new ArrayList<>();

        for (String word : inputArray) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                //System.out.println(uniqueWords);
            } else {
                if (!duplicates.contains(word)) {
                    duplicates.add(word);
                    //System.out.println(duplicates);
                }
            }
        }

        System.out.println("Duplicate words in the array using ArrayList: " + duplicates);
	
        
        
        //Using HashMap
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : inputArray) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Duplicate words in the array using HashMap: ");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " ");
            }
        }
        
        /*
         * 
         * wordCountMap.getOrDefault(word, 0) returns the default value 0. 
         * So, wordCountMap.put("we", 0 + 1) is executed, 
         * and the wordCountMap becomes {"we"=1}. 
         * And at the end of all iterations it becomes - {"we"=2, "were"=1, "where"=1}
         * 
         * 
         */
        
        
        //Using Hash Table
        Hashtable<String, Integer> wordCountTable = new Hashtable<>();

        for (String word : inputArray) {
            wordCountTable.put(word, wordCountTable.getOrDefault(word, 0) + 1);
        }

        System.out.println("Duplicate words in the array using HashTable: ");
        //returns enumeration of all the keys in hashtable & allows to iterate through collection of elements
        Enumeration<String> keys = wordCountTable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            if (wordCountTable.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
        
        
        
        //Using HashSet
        HashSet<String> uni = new HashSet<>();
        HashSet<String> dup = new HashSet<>();

        for (String word : inputArray) {
            if (!uni.add(word)) {
                dup.add(word);
            }
        }

        System.out.println("Duplicate words in the array using HashSet: " + dup);
        
        
        
        
	}

}
