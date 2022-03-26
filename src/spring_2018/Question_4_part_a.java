package spring_2018;

class Cat extends Pet {
    public Cat(int temp) {
        super(temp);
    }

    public void make_noise() {
        System.out.println("Meow");
    }

    boolean is_heated() {
        return (bodyTemperature >= 50);
    }
}

class Dog extends Pet {
    public Dog(int temp) {
        super(temp);
    }

    public void make_noise() {
        System.out.println("Ghew");
    }
}
