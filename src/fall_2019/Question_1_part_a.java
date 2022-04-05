package fall_2019;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double add(int a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator c= new Calculator();

        c.add(1, 2);
        c.add(1, 2.0);
        c.add(1, 2.0, 5.0);
    }
}
