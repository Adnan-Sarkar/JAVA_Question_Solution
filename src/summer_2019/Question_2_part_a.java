package summer_2019;

/*
Yes, there is an Error, because we try to access private attribute directly.
*/

public class Student {
    private String name;

    Student(String n) {
        name=n;
    }

    public String getName() { // getter method for private attribute
        return name;
    }
}

Public class Test{
    public static void main(String[] args) {
        Student s1=new Student("Sam");

        System.out.println(s1.getName()); // using getter method for getting private attributes data
    }
}