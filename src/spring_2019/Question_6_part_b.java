package spring_2019;

abstract class Bike {
    int brandType;
    private abstract void velocity(); // abstract method can't be private
    abstract void showType() { // we can't implement the body of an abstract method in abstract class
        System.out.println("brandType is " +
                brandType);
    }
    public void firstCall() {
        System.out.println("A bike is being made");
    }
}

public class Runner extends Bike {

    protected void firstCall() { // we can't override a method with less accessibility.
        super.firstCall();
        System.out.println("A Runner is being made");
    }

    private void velocity() { // we can't override a method with less accessibility
        System.out.println("Max velocity is 125");
    }

    /*
    we must implement the abstract methods in concrete class. But there is no implementation of "showType"
    method.
     */

    public static void main(String[] args) {
        Bike obj = new Runner();
        obj.firstCall();
    }
}


/*

This code will give us Error.
At first, abstract method can't be private.
Then we can't implement the body of an abstract method in abstract class.
Then we must implement the abstract methods in concrete class.
At last, we can't override a method with less accessibility.

*/
