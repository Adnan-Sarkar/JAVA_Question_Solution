package fall_2019;

/*

There are 2 objects eligible for garbage collection.
At First the object which has attribute name = "Messi" eligible for garbage collection. because it's create inside a
method, So it's reference variable also a local. We know after executing methods statements, all local variables related
this method will be destroyed and at the end method it-self will be pop-up from stack. That's why this "Messi" object
will have no reference variable for point and eligible for garbage collection.

The object which has attribute name = "Modric" eligible for garbage collection, because it's reference variable
change his pointing object, that's why this object will have no reference variable for point and eligible
for garbage collection.

*/
