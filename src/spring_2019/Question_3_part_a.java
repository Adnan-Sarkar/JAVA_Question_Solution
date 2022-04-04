package spring_2019;

/*
This code will give us Error. the main reason is we can't access any child/subclass's method/attribute using
parent/superclass reference variable, because that time compiler will upcasting the child class object to parent
class object and parent class haven't any access of his child class member. We can access child class methods
if the methods override in child class. In the Question there is call a parameterized method which is basically
overloaded not overridden, and we call child class's method using parent class reference e variable and that's
illegal. If we write same method with same signature in parent class then it will be overridden and code will
run without any Error.

*/
