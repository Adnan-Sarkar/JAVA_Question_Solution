package spring_2019;

interface ABC {
    String s = "123";
    // void method1(int a);
    void greeter();
}

class C implements ABC{
    String s = "new";
    public void greeter() {
        System.out.println("Hi");
    }
}

/*

This method should be commented, because we can't write any line in the code, but we can edit.
In class C there is no implement of this method, and this will give us Error, that's why I remove
this method using comment

*/