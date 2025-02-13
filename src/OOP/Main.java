package OOP;

class A {
    public A() {
        super(); // Here super class is Object. Every class extends Object class, but you can't see it.
        System.out.println("Default Constructor of A");
    }

    public A(int n){
        super();
        System.out.println("Parameterized constructor of A : in int");
    }
}

class B extends A{
    public B() {
        super();
        System.out.println("Default Constructor of B");
    }

    public B(int n) {
        //super(n);
        this();
        System.out.println("Parameterized constructor of A : in int");
    }
}
public class Main {
    public static void main(String[] args) {
        B bobj = new B(5);
    }
}
