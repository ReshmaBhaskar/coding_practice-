package coding_javatest;

import coding_javatest.inheritance.Subclass;



class inheritance {
	
	
	public class Superclass {
        public void displayResult() {
            System.out.println("Printing from superclass");
        }
    }

    public class Subclass extends Superclass {
        public void displayResult() {
            System.out.println("Displaying from subclass");
            super.displayResult();
        }
    }
    
    
}


public  class inheritance_example {    
    //When there are nested classes in same script, first create object for the main class & then create class for the other nested classes
    public static void main(String args[]) {
    	inheritance outerInstance = new inheritance();
        Subclass obj = outerInstance.new Subclass();
        obj.displayResult();
    }

}


//--------------------Other approaches---------------------------------
//Instead of using nested classes in samefile ->have each of this super class & subclass in different file 
//& in create a main method in other file  & call the method using object as usual

//File1 
//public class Superclass {
//    public void displayResult() {
//        System.out.println("Printing from superclass");
//    }
//}


//file 2
//public class Subclass extends Superclass {
//    public void displayResult() {
//        System.out.println("Displaying from subclass");
//        super.displayResult();
//    }
//}


//file 3
//public class Main {
//    public static void main(String args[]) {
//        Subclass obj = new Subclass();
//        obj.displayResult();
//    }
//}


//--------------------Other approaches---------------------------------
//make the nested classes static.. so that the object need not be created for main class.

//public class InheritanceExample {
//
//    public static class Superclass {
//        public void displayResult() {
//            System.out.println("Printing from superclass");
//        }
//    }
//
//    public static class Subclass extends Superclass {
//        public void displayResult() {
//            System.out.println("Displaying from subclass");
//            super.displayResult();
//        }
//    }
//
//    public static void main(String args[]) {
//        Subclass obj = new Subclass();
//        obj.displayResult();
//    }
//}

