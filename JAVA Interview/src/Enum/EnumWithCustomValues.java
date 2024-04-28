package Enum;

public enum EnumWithCustomValues {
    // Here every value like SUNDAY, MONDAY will have separate method if the method is not static
    MONDAY(101,"First week of the day!"),
    TUESDAY(102,"Second week of the day!"),
    WEDNESDAY(103,"Third week of the day!"),
    THURSDAY(104,"Fourth week of the day!"),
    FRIDAY(105,"Fifth week of the day!"),
    SATURDAY(106,"Sixth week of the day!"),
    SUNDAY(107,"Seventh week of the day!");
    private int val;
    private String comment;

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    EnumWithCustomValues(int val, String comment){
        this.val=val;
        this.comment=comment;
    }

    public static EnumWithCustomValues getEnumFromValues(int value){
        for(EnumWithCustomValues enumValues:EnumWithCustomValues.values()){
            if(enumValues.val==value){
                return enumValues;
            }
        }
        return null;
    }

}
