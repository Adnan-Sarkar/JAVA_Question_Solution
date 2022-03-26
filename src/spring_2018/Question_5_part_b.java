package spring_2018;

class A{
    public static final int var;
    public int par;
    static{
        var = 10; // var is final, so we don't update this value anymore, this statement must be removed or final keyword must be removed
        par = 5;
        System.out.println("Static block in A");
    }
    void meth(){
        var = 15; // var is final, so we don't update this value anymore, we can write par here
        System.out.println("Method in class A");
    }
}
class B extends A{
    final void meth(){
        var += 20; // var is final, so we don't update this value anymore, we can write par here
        System.out.println("Method in class B");
    }
}

final class C extends B{
    int star;
    void meth(){ // this method alredy final in class B, so it's not possible to override
        System.out.println("Method in class C");
    }
    public static void main(String[] args) {
        B obj1 = new B();
        B obj2 = new B();
        obj1.meth();
        star = 100; // star is an instance variable, so we don't use it without creating object. if we want so, then we have to do static this variable
        System.out.println("par = " + obj1.par + ",var = "+ obj2.var + ", star = " + star);
    }
}
