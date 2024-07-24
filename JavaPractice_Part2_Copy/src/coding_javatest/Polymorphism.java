package coding_javatest;

class A {
    int a, b, c;
 
    public void add(int x, int y)
    {
        a = x;
        b = y;
        System.out.println("addition of a+b is:" + (a + b));
    }
 
    public void add(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
        System.out.println("addition of a+b+c is:" + (a + b + c));
    }
 
    public void print()
    {
        System.out.println("Class A's method is running");
    }
};
 
class Polymorphism extends A {
    public void print()
    {
        System.out.println("Class B's method is running");
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        A a1 = new A();
 
        // method overloading (Compile-time polymorphism)
        a1.add(6, 5);
 
        // method overloading (Compile-time polymorphism)
        a1.add(1, 2, 3);
 
        Polymorphism b1 = new Polymorphism();
 
        // Method overriding (Run-time polymorphism)
        b1.print();
    }
}


