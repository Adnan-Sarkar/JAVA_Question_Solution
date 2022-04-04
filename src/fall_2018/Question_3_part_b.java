package fall_2018;

/*
What is the difference between static binding and dynamic binding?

In one word, I can say static binding is "Fixed", and dynamic binding is "not-Fixed". Basically In java,
there is 2 types of methods, one is "Overloaded Methods" and another one is "Overridden Methods". This 2 types
methods can't act same way, overloaded methods handle by compiler and overridden methods handle by JVM based on
runtime-objects. overloaded methods are fixed for us when we try to access this method using reference variable,
but overloaded methods aren't, because if runtime object is sub-type and we try to access that method
which is already implements in superclass then there is a decision-making step, which method will be call!?
then JVM resolve this confusion and take the object class's overridden method. In conclusion, overloaded
methods are very specific that's why they are fixed and static for binding when which overloaded method
will be call, but overridden methods aren't same, they can be changed based on run-time object that's why they
are dynamic for binding.
*/
