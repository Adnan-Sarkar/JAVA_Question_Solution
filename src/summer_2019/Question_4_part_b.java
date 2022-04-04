package summer_2019;

/*

Table – 1 : No error

*/

//Table – 2 : correction
class B{
    B(int a){
        System.out.println(a);
    }
    void print(){
        System.out.println("this is B class..");
    }
}
public class A {
    public static void main(String[] args) {
        B B_obj = new B(5); // we have to pass the argument of the constructor
    }
}