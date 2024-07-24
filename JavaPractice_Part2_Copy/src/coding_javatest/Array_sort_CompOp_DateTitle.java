package coding_javatest;

import java.util.Arrays;
import java.util.Comparator;

public class Array_sort_CompOp_DateTitle {
    public static void main(String[] args) {
        String[][] data = {
                { "Casablanca", "Warner Brothers", "1942" },
                { "Citizen Kane", "RKO Pictures", "1941" },
                { "Singin' in the Rain", "MGM", "1952" },
                { "The Wizard of OZ", "MGM", "1930"},
                { "AaaaaThe Wizard of OZ", "MGM", "1943"}
        };

        // Sort by movie title (index 0)
        Arrays.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(String[] entry1, String[] entry2) {
                return entry1[0].compareTo(entry2[0]);
            }
        });
        print(data);
        System.out.println();
 
        
        // Sort by release date (index 2)
        Arrays.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(String[] entry1, String[] entry2) {
                return entry1[2].compareTo(entry2[2]);
            }
        });
        print(data);
        System.out.println();

       
        // Sort by company (index 1)
        Arrays.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(String[] entry1, String[] entry2) {
                return entry1[1].compareTo(entry2[1]);
            }
        });
        print(data);
    }

    
    
    
    public static void print(String[][] data) {
        for (String[] array : data) {
            for (String s : array) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}




/*
//optimised way  - method 2


     String[][] data = {
            { "Casablanca", "Warner Brothers", "1942" },
            { "Citizen Kane", "RKO Pictures", "1941" },
            { "Singin' in the Rain", "MGM", "1952" },
            { "The Wizard of OZ", "MGM", "1930"},
            { "AaaaaThe Wizard of OZ", "MGM", "1943"}
        };

        Comparator<String[]> titleComparator = Comparator.comparing(entry -> entry[0]);
        Comparator<String[]> releaseDateComparator = Comparator.comparing(entry -> entry[2]);
        Comparator<String[]> companyComparator = Comparator.comparing(entry -> entry[1]);

        Arrays.sort(data, titleComparator);
        print(data);

        System.out.println();

        Arrays.sort(data, releaseDateComparator);
        print(data);

        System.out.println();

        Arrays.sort(data, companyComparator);
        print(data);
    }

    public static void print(String[][] data) {
        for (String[] array : data) {
            System.out.println(String.join(" ", array));
        }
    }
}


*/