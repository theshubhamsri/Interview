package NestedClasses.AnonymousClass;

public class Test {
    public static void main(String[] args) {
        Car audi=new Car(){

            @Override
            public void pressBreak() {
                System.out.println("Audi Specific Brake Changes");
            }
        };
        audi.pressBreak();
    }
}
