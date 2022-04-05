package summer_2020;

//package living;


public class Animal { //
    public String type; //
    public int age; //
}


//package zoo.exotic;
//import living.*;

class Tiger extends Animal {
    String region;

    void display() {
        System.out.println("This is a " + type);
        System.out.println("It's age is " + age);
        System.out.println("It lives in " + region);
    }
}