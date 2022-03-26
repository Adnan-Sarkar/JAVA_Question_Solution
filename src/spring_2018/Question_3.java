package spring_2018;

/*
Q. "The package is both a naming and a visibility control mechanism."-explain the statement.

Ans: In java, there are lots of classes under some packages. Packages help us to define same
name classes without any naming conflict. Not only naming conflict, but packages also help us to define
which class is accessible and which isn't, for example, if we declare any class without a public modifier
then this class couldn't access outside from the class. In conclusion, package mainly helps us control
2 sides, one is, avoiding the same class name conflict in different packages and
another one is class accessibility or visibility outside the package.


Q. Briefly explain with an appropriate example the differences between Class, Reference and Object.

Ans: Class is a blue-printf for something. In Object-Oriented-Programming, everything is considered as
an object. If we want to create any object at first we need to blue-print of this object, because we
need to decide before creating this object how many attributes and methods will have. Then we will
create object and use here and there. For create an Object we must have a class of this object.
at last, for creating an object we need a pointer/variable who can point/carry the object. this
pointer/variable called as a "Reference" variable. We can access all methods and attributes through
this reference variable. In conclude, before creating an object we need a class and for using/access this
object we need a reference variable.


Q. Can an abstract method be declared private? Explain your answer.

Ans: No, abstract method must be public otherwise we get compile-time error; The main reason is we must
implement this method's body from the child/subclass, but if we declare an abstract method
private then we can't access this method outside the class and child class also. so every time this
private abstract method will be abstract and no one can implement this method's body and that's not
acceptable.

 */
