package spring_2019;

// package zoo;
public class Animal { // must be public, otherwise we can't access this class from different packages
    String name;
    protected int legs;
    Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    void print(){
        System.out.println(name + " " + legs);
    }
}

//package zoo.birds;
class Bird extends Animal{
    String color;
    Bird(){ super("", 0); } // we have pass arguments for parent class constructor, compiler don't pass any argument for us by default

    Bird(String name, int legs, String color){
        super(name, legs); // that will be super and if we have to write parent class constructor in child class constructor using super(), then must be first statement in child class constructor will be super()
        this.color = color; // we refer current class's anything (attributes/methods) using this keyword
    }
    void print(){
        System.out.println(name + " " +  legs + " " + color);
    }
}