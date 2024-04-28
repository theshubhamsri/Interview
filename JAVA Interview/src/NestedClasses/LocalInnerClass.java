package NestedClasses;

/*It can't be public private or protected, only default*/
class LocalInnerClass {
    int instanceVariable=1;
    static int classVariable=2;
    public void display(){
        int methodVariable=3;

        class InnerClass{
            int localVariable=7;

            public void print(){
                System.out.println("Sum"+instanceVariable+classVariable+methodVariable+localVariable);
            }
        }
        InnerClass obj=new InnerClass();
        obj.print();
    }
}
