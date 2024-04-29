package Interfaces.FunctionalInterface.UsingAnonymousClass;

public class Main {

    public static void main(String[] args) {

        Bird eagleObject=new Bird(){
            @Override
            public void canFly(String val) {
                System.out.println("Eagle bird implementation");
            }
        };

        eagleObject.canFly("Hi");
    }

}
