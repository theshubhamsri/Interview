package Enum;

public class Main {
    public static void main(String[] args) {

        //values(), ordinal(), valueOf(), name()
//        for(EnumSample sample:EnumSample.values()){
//            System.out.println(sample.ordinal());
//        }
//
//        EnumSample enumVariable=EnumSample.valueOf("FRIDAY");
//        System.out.println(enumVariable);

        System.out.println(EnumWithCustomValues.getEnumFromValues(105).getVal()+EnumWithCustomValues.getEnumFromValues(105).getComment());

    }
}
