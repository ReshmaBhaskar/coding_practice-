package coding_javatest;

import java.util.Arrays;
import java.util.Comparator;

public class Array_sort_CompOp_PriceProduct {

	public static void main(String[] args) {
		
		
	       String[][] products = {
	                {"Apple", "2.99"},
	                {"Banana", "1.99"},
	                {"Orange", "3.49"},
	                {"Apple", "1.99"}
	        };
	       
	       
	        Arrays.sort(products, Comparator.<String[]>comparingDouble(p -> Double.parseDouble(p[1]))
	                                       .thenComparing(p -> p[0]));
	        
				//	        Apple - 1.99
				//	        Banana - 1.99
				//	        Apple - 2.99
				//	        Orange - 3.49
	        
				//	        Arrays.sort(products, Comparator.comparingDouble(p -> Double.parseDouble(p[1]))
				//                    );
				////	        Banana - 1.99
				////	        Apple - 1.99
				////	        Apple - 2.99
				////	        Orange - 3.49

	        for (String[] product : products) {
	            System.out.println(product[0] + " - " + product[1]);
	            //System.out.println(String.join(" ", product));
	        }

	       
	    }
	}


//------------using custom comparator-----------------

//Arrays.sort(products, new ProductComparator());
//
//for (String[] product : products) {
//    String name = product[0];
//    double price = Double.parseDouble(product[1]);
//    System.out.println(name + " - " + price);
//}
//}
//
//static class ProductComparator implements Comparator<String[]> {
//public int compare(String[] p1, String[] p2) {
//    double price1 = Double.parseDouble(p1[1]);
//    double price2 = Double.parseDouble(p2[1]);
//    int priceComparison = Double.compare(price1, price2);
//    if (priceComparison != 0) {
//        return priceComparison;
//    }
//    return p1[0].compareTo(p2[0]);
//}

//--------------------------------------------------------------
////compares only price part of the input
//Arrays.sort(products,Comparator.comparing(p->Double.parseDouble(p[1])));
//
//for(String[] p :products) {
//	String pro = p[0];
//	Double price = Double.parseDouble(p[1]);
//	System.out.println(pro +":"+ price);
//}