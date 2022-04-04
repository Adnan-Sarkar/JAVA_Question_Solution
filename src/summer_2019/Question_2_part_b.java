package summer_2019;

public class Shape
{
    void introduce()
    {
        System.out.println("It is shape class");
    }
}

public class Triangle extends Shape
{
    @Override
    void introduce()
    {
        System.out.println("It is Triangle class");
    }
    Void calcArea()
    { System.out.println("Calculate Area");
    }
}

Public class Test{
    public static void main(String[] args)
    {
        Shape s = new Triangle();
        s.introduce();
        //S.calcArea(); // we can't add/delete any new line, that's why I comment this line otherwise it will give us Error
    }
}
