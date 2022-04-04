package spring_2019;

class Fruit {
    String name;
    double weight, price;

    public Fruit(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void reducePricePerKG(double p) {
        this.price -= p;
    }

    public void increasePricePerKG(double p) {
        this.price += p;
    }

    public void printDetails() {
        System.out.println("Fruit Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Weight: " + this.weight + "kg");
        System.out.println("Price per kg: " + this.price * this.weight + "\n");
    }
}
