package Enum;

public enum EnumWithInterface implements MyInterface{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toLower() {
        return this.name().toLowerCase();
    }
}
