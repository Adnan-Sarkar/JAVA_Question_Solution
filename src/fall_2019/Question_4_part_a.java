package fall_2019;

//package pack1;
public class Vehicle {
    protected int id;
    public String name; // This should be public, other-wise from different packages we can't access it
    public Vehicle(String name){
        this.name=name;
    }
}


//package pack1;
public class Bike extends Vehicle {
    public Bike(String name, int id){
        super(name);
        this.id=id;
    }
    public void print(){ // This should be public, other-wise from different packages we can't access it
        System.out.println(name+ " " + id);
    }
}

//package pack1.pack2;
//import pack1.Vehicle; // must be import other class from other packages

public class Car extends Vehicle {
    public Car(String name, int id){
        super(name);
        this.id=id;
    }
    void print(){
        System.out.println(name + " " + id);
    }
}

//package pack1.pack2;
//import pack1.*;

public class Main {
    public static void main(String args[]){
        Vehicle v = new Vehicle("Cart");
        System.out.println( v.name);
        Car c=new Car("BMW", 101);
        c.print();
        Bike b=new Bike("Pulsar", 102);
        b.print();
    }
}