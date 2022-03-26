package spring_2018;
/*
Write three classes: Animal, Cat, and AnimalHeredityTest.
The Animal class has three private variables:
vegetarian, eats, and noOfLegs. On the other hand, Cat class has only one private variable: color.
Cat class inherits Animal Class. In AnimalHeredityTest class, create an object c1 of Cat class and
display the properties of the object c1 and its parent’s.
Use any of the Object-Oriented feature to access the private variables of the base
and child classes. Note: You need to write code for all 3 classes.
*/

class Animal {
    private String vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal(String vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}

class Cat extends Animal{
    private String color;

    public Cat(String vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class AnimalHeredityTest {
    public static void main(String[] args) {
        Cat c1 = new Cat("Broccoli", "meat & milk", 4, "brown");
        System.out.println(c1.getColor());
        System.out.println(c1.getNoOfLegs());
        System.out.println(c1.getVegetarian());
        System.out.println(c1.getEats());
    }
}