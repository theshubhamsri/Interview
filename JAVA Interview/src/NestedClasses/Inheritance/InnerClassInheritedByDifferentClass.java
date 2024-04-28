package NestedClasses.Inheritance;

public class InnerClassInheritedByDifferentClass extends OuterClass.InnerClass2{

    public InnerClassInheritedByDifferentClass(){
        new OuterClass().super();
        //When child class constructor will be called first parent class constructor will be invoked
        //but here the parent is inner class, so it can be accessed by the object of outer class
    }
    public void print(){
        display();
    }
}
