package NestedClasses;

/*Can be private public protected default*/
public class MemberInnerClass {
      int instanceVariable=1;
      static int classVariable=2;

      class InnerClass{
          public void print(){
              System.out.println("Inside inner class"+instanceVariable+classVariable);
          }
      }

}
