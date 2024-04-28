package NestedClasses.Inheritance;
//inner class extending another inner class
public class OuterClass {
    int instanceVariable=1;
    static int classVariable=2;

    public class InnerClass1{
        int innerClass1=3;
    }
    public class InnerClass2 extends InnerClass1{
        int innerClass2=4;
        public void display(){
            System.out.println(instanceVariable+classVariable+innerClass1+innerClass2);
        }
    }
}
