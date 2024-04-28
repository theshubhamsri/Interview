package NestedClasses;

class StaticNestedClass {
      int instanceVariable=0;
      static int classVariable=0;
      private static class NestedClass{
          public void print(){
              System.out.println("Variables: "+classVariable);
          }
      }
      public void display(){
          NestedClass nestedObj=new NestedClass();
          nestedObj.print();
      }
}
