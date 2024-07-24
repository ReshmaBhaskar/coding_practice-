package coding_javatest;

import java.util.Arrays;
import java.util.Comparator;

public class Array_sort_CompOp_Age {

	public static void main(String[] args) {
		
		//Sorting an array of objects based on a specific attribute (like age, number, etc..)
	

		        String[][] input = {
		            {"Alice", "45"},
		            {"Bob", "30"},
		            {"Charlie", "30"},
		            {"Dave", "35"}
		        };

		        Arrays.sort(input, Comparator.comparingInt(p -> Integer.parseInt(p[1])));

		        for (String[] person : input) {
					
					 String name = person[0]; 
					 int age = Integer.parseInt(person[1]);
					 System.out.println(name + " - " + age);
				
		        }
		    }
		}




/*
//About Array sort/ comparator method

Now, let's look at some additional real-time examples or coding exercises to practice using Comparator.compare() with arrays:

1. Sorting an array of objects based on a specific attribute:
Suppose you have an array of Person objects, and you want to sort them based on their age in ascending order. 
You can create a custom Comparator<Person> that compares the ages of the objects using 
Comparator.comparingInt() and Person::getAge.

2. Sorting an array of numbers in descending order:
Given an array of integers, you can sort it in descending order by using 
Comparator.comparingInt() with reversed natural order. 
For example: Arrays.sort(numbers, Comparator.comparingInt(Integer::intValue).reversed()).

3.Sorting an array of custom objects based on multiple attributes:
If you have an array of Product objects and want to sort them based on price and then by name, 
you can create a custom Comparator<Product> that compares both attributes. 
For example: Comparator.comparingDouble(Product::getPrice).thenComparing(Product::getName).


4. Sorting an array of strings based on a custom comparison logic:
Let's say you have an array of strings that represent version numbers (e.g., "1.5.2", "1.3.10", "1.12.1"),
 and you want to sort them in descending order based on the version numbers. 
 You can create a custom Comparator<String> that compares the versions using a custom logic. 
For example, splitting the strings into individual parts and comparing them numerically. */











