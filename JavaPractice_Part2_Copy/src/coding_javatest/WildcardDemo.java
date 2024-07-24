package coding_javatest;

import java.util.ArrayList;
import java.util.List;


public class WildcardDemo {

    // Upper bound wildcard - This method accepts a list of elements that are a subtype of Number.
    public static double sumOfListUpperBound(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Lower bound wildcard - This method accepts a list of elements that are a supertype of Integer.
    public static void addIntegersToLowerBound(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    // Unbounded wildcard - This method accepts a list of any type (unknown type).
    public static void printListUnbounded(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
    
    
    

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(8);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);

        System.out.println("Sum of the integer list: " + sumOfListUpperBound(integerList));
        // sumOfListUpperBound(doubleList); // Error: Double is not a subtype of Number

        List<Number> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200.5);

        addIntegersToLowerBound(integerList);
        // addIntegersToLowerBound(numberList); // Error: Number is not a supertype of Integer

        System.out.println("Printing the integer list:");
        printListUnbounded(integerList);
        System.out.println("Printing the double list:");
        printListUnbounded(doubleList);
        System.out.println("Printing the number list:");
        printListUnbounded(numberList);
    }
}
