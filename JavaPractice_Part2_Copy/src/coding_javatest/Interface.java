package coding_javatest;


//defining interface
interface X
{
   public void myMethod();
}

interface Y
{
   public void myMethod();
   public void otherMethod();
}


//implementing interface
public class Interface implements X, Y
{
   public void myMethod()
   {
       System.out.println("Implementing more than one interfaces");
   }
   
   public void otherMethod()
   {
       System.out.println("Implementing more than one interfaces - Other");
   }
   
   public static void main(String args[]){
	  Interface obj = new Interface();
	   //Y obj = new Interface(); // This calling also provides same output
	   obj.myMethod();
	   obj.otherMethod();
   }
}
