package fall_2019;


abstract class Car {
    protected String model, color;
    protected int maxSpeed;

    abstract void accelerate();
    abstract void brake();
}

class Audi extends Car {
    public Audi(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void accelerate() {
        System.out.println("running");
    }

    void brake() {
        System.out.println("break");
    }
}
