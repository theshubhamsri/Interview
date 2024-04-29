package Interfaces.FunctionalInterface.UsingLambdaExpression;

public class Main {
    public static void main(String[] args) {
        Bird eagleObject=(String value)->{
            System.out.println("Eagle bird implementation");
        };

        eagleObject.canFly("Vertical");
    }
}
