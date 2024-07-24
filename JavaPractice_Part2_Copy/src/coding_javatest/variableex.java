package coding_javatest;

public class variableex {

	 
    public String geek; // Declared Instance Variable
 
    public  variableex()
    { // Default Constructor
 
        this.geek = "Shubham Jain"; // initializing Instance Variable
    }
    
    
    //Main Method
    public static void main(String[] args)
    { 
        // Object Creation
    	variableex name = new variableex();
    	
        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
    }
}
