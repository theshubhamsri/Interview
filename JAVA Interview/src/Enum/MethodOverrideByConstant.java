package Enum;

public enum MethodOverrideByConstant {
    MONDAY{
            @Override public void dummyMethod(){
        System.out.println("Default dummy method");
    }},
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){
        System.out.println("Default dummy method");
    }
}
