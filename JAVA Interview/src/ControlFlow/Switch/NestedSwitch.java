package ControlFlow.Switch;

public class NestedSwitch {
    public static void main(String[] args) {
        Day dayEnumVal = Day.MONDAY;
        int outputValue = 0;
        switch (dayEnumVal) {
            case MONDAY:
                outputValue = 1;
                switch (outputValue) {
                    case 1:
                        System.out.println("output value:" + 1);
                        break;
                    case 2:
                        System.out.println("output value:" + 2);
                        break;
                    default:
                        System.out.println("output value:" + outputValue);
                }
                break;
            case TUESDAY:
                outputValue = 2;
                break;
            case WEDNESDAY:
                outputValue = 3;
                break;
            case THURSDAY:
                outputValue = 4;
                break;
        }
        System.out.println(outputValue);
    }
}
