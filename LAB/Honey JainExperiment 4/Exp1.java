// Write a Java program to show that private member of a super class cannot be accessed from derived classes.
class Parent {
    int a;
    private int b;
    protected int c;

    Parent(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void print1() {
        System.out.println("Public method");
    }

    private void print2() {
        System.out.println("Private method");
    }

    protected void print3() {
        System.out.println("Protected method");
    }
}

class Child extends Parent {
    private int d;

    Child(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }
}

public class Exp1 {
    public static void main(String[] args) {
        Parent p = new Parent(1, 2, 3);
        p.print1();

	    //p.print2(); // Will show print2() has private access in Parent
        Child c = new Child(10, 20, 30, 40);
        c.print1();

        //c.print2(); //Will show print2 is not visible to child class
    }
}
