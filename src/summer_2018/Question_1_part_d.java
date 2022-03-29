package summer_2018;

interface ABC {
    String s = "123";

    void method1(int a);
    void greeter();
}

class C implements ABC {
    String s = "new";

    public void greeter() {
        System.out.println("Hi");
    }

    // we must implement the abstract methods in concrete class, where all methods inside an interface are public and abstract
    public void method1(int a) {
        System.out.println(a);
    }
}
