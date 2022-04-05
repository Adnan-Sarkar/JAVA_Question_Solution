package summer_2020;



class Parent {
    private int var1;
    private int var2;

    public Parent(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    void display() {
        System.out.println(var1 + " " + var2);
    }
}

class Child extends Parent {
    int var3;

    public Child(int a, int b, int c) { //
        super(a, b);
        this.var3 = c;
    }

    void display() {
        super.display(); //
        System.out.println(var3);
    }
}

class Main {
    public static void main(String[] args) {
        Child childObj = new Child(10, 20, 30);
        childObj.display();
    }
}
