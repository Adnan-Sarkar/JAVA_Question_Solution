package summer_2018;

abstract  class A { // abstract should be removed
    A() {
        System.out.print("Hello ");
    }

}

class B extends A {
    B() {
        System.out.println("World");
    }
}

public class helloWorld {
    public static void main(String[] args) {
        A a = new A(); // we have to create B class's object instead of A class's object
        a = new B(); // this line should be removed
    }
}
