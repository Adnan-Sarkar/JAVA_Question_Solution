package summer_2020;

class Currency {
    public String country;
    public double amount = 2000.0;
    public boolean isAvailable;

    public Currency() { // create no parameterized constructor
    }

    public Currency(double val) {
        amount = val;
    }

    public Currency(boolean isAvailable) { // create boolean parameterized constructor
        this.isAvailable = isAvailable;
    }

    public void addVal(double c) {
        amount += c;
    }

    public void addAmount(double c, double amount) {
        amount += c;
    }

    public double getAmount() {
        return amount;
    }
}

class T {
    public static void main(String[] args) {
        Currency X = new Currency();
        Currency Y = new Currency(1000.);
        Currency Z = new Currency(true);

        X.addVal(5000);
        Y.amount += 2000;
        Z.addAmount(3000.0, 1000.0);

        System.out.println(X.getAmount() + " " + X.isAvailable);
        System.out.println(Y.getAmount() + " " + Y.isAvailable);
        System.out.println(Z.getAmount() + " " + Z.isAvailable);
    }
}

/*

OUTPUT: 7000.0 false
        3000.0 false
        2000.0 true

*/
