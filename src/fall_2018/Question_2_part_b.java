package fall_2018;

public class Simple {
    static int a=5;
    static int b=6; // this variable use in the static method and static method can't access any instance variable

    private int x=5; // variable name can't start with any numbers/special characters, compiler allows only "_"(underscore) or "$"(dollar)

    public int data=100; // in the main method, reference variable try to access this attribute, so it must be public

    static void sum(){
        System.out.println(a+b);
    }
}