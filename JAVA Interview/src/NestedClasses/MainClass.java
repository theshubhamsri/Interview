package NestedClasses;

import NestedClasses.Inheritance.InnerClassInheritedByDifferentClass;

public class MainClass {
    public static void main(String[] args) {
        //Static Nested Class without using private modifier
        //NestedClasses.StaticNestedClass.NestedClass nestedObj=new NestedClasses.StaticNestedClass.NestedClass();
        //nestedObj.print();
        //Using private nested class
//        NestedClasses.StaticNestedClass staticNestedClass=new NestedClasses.StaticNestedClass();
//        staticNestedClass.display();
//
//        /*Member Inner Class*/
//        NestedClasses.MemberInnerClass memberInnerClass=new NestedClasses.MemberInnerClass();
//
//        NestedClasses.MemberInnerClass.InnerClass innerClassObj=memberInnerClass.new InnerClass();
//        innerClassObj.print();
//        LocalInnerClass localInnerClass=new LocalInnerClass();
//        localInnerClass.display();
//        OuterClass obj=new OuterClass();
//        OuterClass.InnerClass2 innerClass2Obj=obj.new InnerClass2();
//        innerClass2Obj.display();
//        SomeOtherClass someOtherClass=new SomeOtherClass();
//        someOtherClass.display();
        InnerClassInheritedByDifferentClass innerClassInheritedByDifferentClass=new InnerClassInheritedByDifferentClass();
        innerClassInheritedByDifferentClass.display();

    }
}
